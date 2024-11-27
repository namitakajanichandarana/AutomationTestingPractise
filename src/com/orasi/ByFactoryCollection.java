package com.orasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.orasi.datasource.*;

/**
 * Similar to ByFactory, this create a ByFactory used for Tiered lookups
 * @see ByFactory
 * 
 */
public class ByFactoryCollection extends ByFactory {

  private final List<ByFactory> byList = new ArrayList<>( 10 );

  /**
   * A collection of by factories
   * @param byFactories
   */
  public ByFactoryCollection( ByFactory... byFactories ) {
    super( ByCollection.class, null, null, null );
    byList.addAll(Arrays.asList( byFactories ));
  }
  
  /**
   * The friendly name for this tiered lookup
   * @param name
   * @param alchemyId
   * @param shadowHost An optional parameter instructing this locator is relative to a shadow root
   */
  public ByFactoryCollection( String name, String alchemyId, String shadowHost ) {
    super( ByCollection.class, null, name, alchemyId, shadowHost );
  }
  
  /**
   * The friendly name for this tiered lookup
   * @param name
   * @param alchemyId
   */
  public ByFactoryCollection( String name, String alchemyId ) {
    super( ByCollection.class, null, name, alchemyId, null );
  }
  
  /**
   * A default ByFactoryCollection instance
   */
  public ByFactoryCollection() {
    super( ByCollection.class, null, "Unknown", null );
  }
  
  /**
   * Adds a ByFactory to the current list
   * @param bF
   */
  public final void add( ByFactory bF ) {
    byList.add( bF );
  }

  @Override
  public By create(Map<String, Object> contextMap, DataSourceProvider dM) {
    By shadowBy = null;

    if (getShadowHost() != null && !getShadowHost().trim().isEmpty()) {
      shadowBy = ObjectManager.instance().getObject(getShadowHost(), contextMap, dM);
    }
    
    By[] bA = new By[ byList.size() ];
    
    for ( int i=0; i< byList.size(); i++ ) {
      bA[ i ] = byList.get( i ).create(contextMap, dM);
    }
    
    By useBy = new ByCollection( getName(), getAlchemyId(), bA );
    
    if (shadowBy != null) {
      return new ByChain(getName(), getAlchemyId(), shadowBy, useBy );
    } else {
      return useBy;
    } 
  }
}
