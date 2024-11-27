
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.google.com
    Add a description of www.google.com
    */
    /* Page: Google 
    
    */

    

bC = new ByFactoryCollection("W0wltc", "21885.2003", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"W0wltc\"]", "IDRule", "21885.2005", "" ) );
bC.add( new ByFactory( ById.class, "W0wltc", "IDRule", "21885.2007", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"W0wltc\"]", "IDRule", "21885.2009", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@data-ved='0ahUKEwjbzo2-1NSJAxVmZ0EAHeVyJUwQ4cIICIEB']", "AttributeRule", "21885.2011", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-ved='0ahUKEwjbzo2-1NSJAxVmZ0EAHeVyJUwQ4cIICIEB']", "AttributeRule", "21885.2013", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='GzLjMd'])[1]/button[1]", "ParentRule[IndexedAttributeRule]", "21885.2015", "" ) );


objectMap.put( "21885.2003", bC );


bC = new ByFactoryCollection("q", "21885.2018", "");
bC.add( new ByFactory( ByXPath.class, "//textarea[@id=\"APjFqb\"]", "IDRule", "21885.2020", "" ) );
bC.add( new ByFactory( ById.class, "APjFqb", "IDRule", "21885.2022", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"APjFqb\"]", "IDRule", "21885.2024", "" ) );
bC.add( new ByFactory( ByXPath.class, "//textarea[@name=\"q\"]", "NameRule", "21885.2026", "" ) );
bC.add( new ByFactory( ByName.class, "q", "NameRule", "21885.2028", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"q\"]", "NameRule", "21885.2030", "" ) );


objectMap.put( "21885.2018", bC );
/* Page: default 
    
    */

    /* Page: automation practice - Google Search 
    
    */

    

bC = new ByFactoryCollection("MyShopautomationpracticeplhttp://wwwautomationpracticepl", "21885.2039", "");
bC.add( new ByFactory( ByXPath.class, "//a[@href='http://www.automationpractice.pl/']", "AttributeRule", "21885.2041", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='http://www.automationpractice.pl/']", "AttributeRule", "21885.2043", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-ved='2ahUKEwjI9q3E1NSJAxU9a0EAHQeFIW4QFnoECBgQAQ']", "AttributeRule", "21885.2045", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-ved='2ahUKEwjI9q3E1NSJAxU9a0EAHQeFIW4QFnoECBgQAQ']", "AttributeRule", "21885.2047", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwjI9q3E1NSJAxU9a0EAHQeFIW4QFnoECBgQAQ']", "AttributeRule", "21885.2049", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwjI9q3E1NSJAxU9a0EAHQeFIW4QFnoECBgQAQ']", "AttributeRule", "21885.2051", "" ) );


objectMap.put( "21885.2039", bC );
/* Page: Automation pratise - Google Search 
    
    */

    

bC = new ByFactoryCollection("MyShopautomationpracticeplhttp://wwwautomationpracticepl", "21885.2190", "");
bC.add( new ByFactory( ByXPath.class, "//a[@href='http://www.automationpractice.pl/']", "AttributeRule", "21885.2192", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='http://www.automationpractice.pl/']", "AttributeRule", "21885.2194", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-ved='2ahUKEwjm49GY1dSJAxXwZEEAHbS9Md0QFnoECBkQAQ']", "AttributeRule", "21885.2196", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-ved='2ahUKEwjm49GY1dSJAxXwZEEAHbS9Md0QFnoECBkQAQ']", "AttributeRule", "21885.2198", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwjm49GY1dSJAxXwZEEAHbS9Md0QFnoECBkQAQ']", "AttributeRule", "21885.2200", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwjm49GY1dSJAxXwZEEAHbS9Md0QFnoECBkQAQ']", "AttributeRule", "21885.2202", "" ) );


objectMap.put( "21885.2190", bC );
/* Page: Automation practise - Google Search 
    
    */

    

bC = new ByFactoryCollection("MyShopautomationpracticeplhttp://wwwautomationpracticepl", "21892.762", "");
bC.add( new ByFactory( ByXPath.class, "//a[@href='http://www.automationpractice.pl/']", "AttributeRule", "21892.764", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='http://www.automationpractice.pl/']", "AttributeRule", "21892.766", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-ved='2ahUKEwi84fiB1tSJAxXVRkEAHf20CjsQFnoECA0QAQ']", "AttributeRule", "21892.768", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-ved='2ahUKEwi84fiB1tSJAxXVRkEAHf20CjsQFnoECA0QAQ']", "AttributeRule", "21892.770", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwi84fiB1tSJAxXVRkEAHf20CjsQFnoECA0QAQ']", "AttributeRule", "21892.772", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@ping='/url?sa=t&source=web&rct=j&opi=89978449&url=http://www.automationpractice.pl/&ved=2ahUKEwi84fiB1tSJAxXVRkEAHf20CjsQFnoECA0QAQ']", "AttributeRule", "21892.774", "" ) );


objectMap.put( "21892.762", bC );
/*
    Site: www.automationpractice.pl
    Add a description of www.automationpractice.pl
    */
    /* Page: My Shop 
    
    */

    

bC = new ByFactoryCollection("Contactus", "21885.2059", "");
bC.add( new ByFactory( ByXPath.class, "//a[@href='http://www.automationpractice.pl/index.php?controller=contact']", "AttributeRule", "21885.2061", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='http://www.automationpractice.pl/index.php?controller=contact']", "AttributeRule", "21885.2063", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@title='Contact us']", "AttributeRule", "21885.2065", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@title='Contact us']", "AttributeRule", "21885.2067", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"contact-link\"]/a[1]", "ParentRule[IDRule]", "21885.2069", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"contact-link\"]/a[1]", "ParentRule[IDRule]", "21885.2071", "" ) );


objectMap.put( "21885.2059", bC );


bC = new ByFactoryCollection("Dresses", "21885.2098", "");
bC.add( new ByFactory( ByXPath.class, "(//a[@href='http://www.automationpractice.pl/index.php?id_category=8&controller=category'])[2]", "IndexedAttributeRule", "21885.2100", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@title='Dresses'])[2]", "IndexedAttributeRule", "21885.2102", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@class='sf-with-ul'])[4]", "IndexedAttributeRule", "21885.2104", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@class='sfHover']/a[1]", "ParentRule[AttributeRule]", "21885.2106", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='sfHover']/a[1]", "ParentRule[AttributeRule]", "21885.2108", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]", "AbsoluteRule", "21885.2110", "" ) );


objectMap.put( "21885.2098", bC );


bC = new ByFactoryCollection("Women", "21885.2206", "");
bC.add( new ByFactory( ByXPath.class, "//a[@title='Women']", "AttributeRule", "21885.2208", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='http://www.automationpractice.pl/index.php?id_category=3&controller=category'])[1]", "IndexedAttributeRule", "21885.2210", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@class='sf-with-ul'])[1]", "IndexedAttributeRule", "21885.2212", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@class='sfHover']/a[1]", "ParentRule[AttributeRule]", "21885.2214", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='sfHover']/a[1]", "ParentRule[AttributeRule]", "21885.2216", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]", "AbsoluteRule", "21885.2218", "" ) );


objectMap.put( "21885.2206", bC );
/* Page: default 
    
    */

    /* Page: Contact us - My Shop 
    
    */

    

bC = new ByFactoryCollection("ReturntoHome", "21885.2083", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='home']", "AttributeRule", "21885.2085", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='home']", "AttributeRule", "21885.2087", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@title='Return to Home']", "AttributeRule", "21885.2089", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@title='Return to Home']", "AttributeRule", "21885.2091", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2093", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2095", "" ) );


objectMap.put( "21885.2083", bC );
/* Page: Dresses - My Shop 
    
    */

    

bC = new ByFactoryCollection("PrintedDress", "21885.2121", "");
bC.add( new ByFactory( ByXPath.class, "(//a[@class='product-name'])[2]", "IndexedAttributeRule", "21885.2123", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='http://www.automationpractice.pl/index.php?id_product=3&controller=product'])[4]", "IndexedAttributeRule", "21885.2125", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@title='Printed Dress'])[2]", "IndexedAttributeRule", "21885.2127", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@itemprop='url'])[3]", "IndexedAttributeRule", "21885.2129", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//h5[@itemprop='name'])[1]/a[1]", "ParentRule[IndexedAttributeRule]", "21885.2131", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]", "AbsoluteRule", "21885.2133", "" ) );


objectMap.put( "21885.2121", bC );
/* Page: Printed Dress - My Shop 
    
    */

    

bC = new ByFactoryCollection("ReturntoHome", "21885.2138", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='home']", "AttributeRule", "21885.2140", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='home']", "AttributeRule", "21885.2142", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@title='Return to Home']", "AttributeRule", "21885.2144", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@title='Return to Home']", "AttributeRule", "21885.2146", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2148", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2150", "" ) );


objectMap.put( "21885.2138", bC );
/* Page: Women - My Shop 
    
    */

    

bC = new ByFactoryCollection("FadedShortSleeveT-shirts", "21885.2227", "");
bC.add( new ByFactory( ByXPath.class, "//a[./img[@src='http://www.automationpractice.pl/img/p/1/1-home_default.jpg']]", "ChildRule[AttributeRule]", "21885.2229", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./*[@src='http://www.automationpractice.pl/img/p/1/1-home_default.jpg']]", "ChildRule[AttributeRule]", "21885.2231", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./img[@alt='Faded Short Sleeve T-shirts']]", "ChildRule[AttributeRule]", "21885.2233", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./*[@alt='Faded Short Sleeve T-shirts']]", "ChildRule[AttributeRule]", "21885.2235", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./img[@title='Faded Short Sleeve T-shirts']]", "ChildRule[AttributeRule]", "21885.2237", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='product-image-container'])[1]/a[1]", "ParentRule[IndexedAttributeRule]", "21885.2239", "" ) );


objectMap.put( "21885.2227", bC );


bC = new ByFactoryCollection("FadedShortSleeveT-shirts-1", "21892.779", "");
bC.add( new ByFactory( ByXPath.class, "(//a[@class='product-name'])[2]", "IndexedAttributeRule", "21892.781", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='http://www.automationpractice.pl/index.php?id_product=1&controller=product'])[4]", "IndexedAttributeRule", "21892.783", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@title='Faded Short Sleeve T-shirts'])[2]", "IndexedAttributeRule", "21892.785", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@itemprop='url'])[2]", "IndexedAttributeRule", "21892.787", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//h5[@itemprop='name'])[1]/a[1]", "ParentRule[IndexedAttributeRule]", "21892.789", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[contains( text(), \"Faded Short Sleeve T-shirts\")][1]", "TextRule", "21892.791", "" ) );


objectMap.put( "21892.779", bC );
/* Page: Faded Short Sleeve T-shirts - My Shop 
    
    */

    

bC = new ByFactoryCollection("Blue", "21885.2244", "");
bC.add( new ByFactory( ByXPath.class, "//a[@id=\"color_14\"]", "IDRule", "21885.2246", "" ) );
bC.add( new ByFactory( ById.class, "color_14", "IDRule", "21885.2248", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"color_14\"]", "IDRule", "21885.2250", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@name=\"Blue\"]", "NameRule", "21885.2252", "" ) );
bC.add( new ByFactory( ByName.class, "Blue", "NameRule", "21885.2254", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"Blue\"]", "NameRule", "21885.2256", "" ) );


objectMap.put( "21885.2244", bC );


bC = new ByFactoryCollection("group_1", "21885.2259", "");
bC.add( new ByFactory( ByXPath.class, "//select[@id=\"group_1\"]", "IDRule", "21885.2261", "" ) );
bC.add( new ByFactory( ById.class, "group_1", "IDRule", "21885.2263", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"group_1\"]", "IDRule", "21885.2265", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[@name=\"group_1\"]", "NameRule", "21885.2267", "" ) );
bC.add( new ByFactory( ByName.class, "group_1", "NameRule", "21885.2269", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"group_1\"]", "NameRule", "21885.2271", "" ) );


objectMap.put( "21885.2259", bC );


bC = new ByFactoryCollection("SizeLSMLColor", "21885.2278", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='content_prices clearfix']/following-sibling::div[1]", "SiblingRule", "21885.2280", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='product_attributes clearfix']", "AttributeRule", "21885.2282", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='product_attributes clearfix']", "AttributeRule", "21885.2284", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"quantity_wanted_p\"]]", "ChildRule[IDRule]", "21885.2286", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"quantity_wanted_p\"]]", "ChildRule[IDRule]", "21885.2288", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"minimal_quantity_wanted_p\"]]", "ChildRule[IDRule]", "21885.2290", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"minimal_quantity_wanted_p\"]]", "ChildRule[IDRule]", "21885.2292", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"attributes\"]]", "ChildRule[IDRule]", "21885.2294", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"attributes\"]]", "ChildRule[IDRule]", "21885.2296", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='box-info-product']/div[2]", "ParentRule[AttributeRule]", "21885.2298", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='box-info-product']/div[2]", "ParentRule[AttributeRule]", "21885.2300", "" ) );


objectMap.put( "21885.2278", bC );


bC = new ByFactoryCollection("Orange", "21885.2303", "");
bC.add( new ByFactory( ByXPath.class, "//a[@id=\"color_13\"]", "IDRule", "21885.2305", "" ) );
bC.add( new ByFactory( ById.class, "color_13", "IDRule", "21885.2307", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"color_13\"]", "IDRule", "21885.2309", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@name=\"Orange\"]", "NameRule", "21885.2311", "" ) );
bC.add( new ByFactory( ByName.class, "Orange", "NameRule", "21885.2313", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"Orange\"]", "NameRule", "21885.2315", "" ) );


objectMap.put( "21885.2303", bC );


bC = new ByFactoryCollection("SizeMSML", "21885.2326", "");
bC.add( new ByFactory( ByXPath.class, "//fieldset[./label[@for='group_1']]", "ChildRule[AttributeRule]", "21885.2328", "" ) );
bC.add( new ByFactory( ByXPath.class, "//fieldset[./*[@for='group_1']]", "ChildRule[AttributeRule]", "21885.2330", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='clearfix'])[3]/following-sibling::fieldset[1]", "SiblingRule", "21885.2332", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"attributes\"]/fieldset[1]", "ParentRule[IDRule]", "21885.2334", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"attributes\"]/fieldset[1]", "ParentRule[IDRule]", "21885.2336", "" ) );
bC.add( new ByFactory( ByXPath.class, "//fieldset[./label[text()=\"Size \"]]", "ChildRule[TextRule]", "21885.2338", "" ) );


objectMap.put( "21885.2326", bC );


bC = new ByFactoryCollection("ReturntoHome", "21885.2349", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='home']", "AttributeRule", "21885.2351", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='home']", "AttributeRule", "21885.2353", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@title='Return to Home']", "AttributeRule", "21885.2355", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@title='Return to Home']", "AttributeRule", "21885.2357", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2359", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='breadcrumb clearfix']/a[1]", "ParentRule[AttributeRule]", "21885.2361", "" ) );


objectMap.put( "21885.2349", bC );


bC = new ByFactoryCollection("FadedShortSleeveT-shirtsReference:demo_1Condition:NewproductFade...", "21892.799", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='pb-left-column col-xs-12 col-sm-4 col-md-5']/following-sibling::div[1]", "SiblingRule", "21892.801", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='pb-center-column col-xs-12 col-sm-4']", "AttributeRule", "21892.803", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='pb-center-column col-xs-12 col-sm-4']", "AttributeRule", "21892.805", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1[@itemprop='name']]", "ChildRule[AttributeRule]", "21892.807", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@itemprop='name']]", "ChildRule[AttributeRule]", "21892.809", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"product_reference\"]]", "ChildRule[IDRule]", "21892.811", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"product_reference\"]]", "ChildRule[IDRule]", "21892.813", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"product_condition\"]]", "ChildRule[IDRule]", "21892.815", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"product_condition\"]]", "ChildRule[IDRule]", "21892.817", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"short_description_block\"]]", "ChildRule[IDRule]", "21892.819", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"short_description_block\"]]", "ChildRule[IDRule]", "21892.821", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"pQuantityAvailable\"]]", "ChildRule[IDRule]", "21892.823", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"pQuantityAvailable\"]]", "ChildRule[IDRule]", "21892.825", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"availability_statut\"]]", "ChildRule[IDRule]", "21892.827", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"availability_statut\"]]", "ChildRule[IDRule]", "21892.829", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"last_quantities\"]]", "ChildRule[IDRule]", "21892.831", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"last_quantities\"]]", "ChildRule[IDRule]", "21892.833", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@class='warning_inline']]", "ChildRule[AttributeRule]", "21892.835", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='warning_inline']]", "ChildRule[AttributeRule]", "21892.837", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@id=\"availability_date\"]]", "ChildRule[IDRule]", "21892.839", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"availability_date\"]]", "ChildRule[IDRule]", "21892.841", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"oosHook\"]]", "ChildRule[IDRule]", "21892.843", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"oosHook\"]]", "ChildRule[IDRule]", "21892.845", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[@class='socialsharing_product list-inline no-print']]", "ChildRule[AttributeRule]", "21892.847", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='socialsharing_product list-inline no-print']]", "ChildRule[AttributeRule]", "21892.849", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./ul[@id=\"usefull_link_block\"]]", "ChildRule[IDRule]", "21892.851", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"usefull_link_block\"]]", "ChildRule[IDRule]", "21892.853", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./ul[@class='clearfix no-print']]", "ChildRule[AttributeRule]", "21892.855", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='clearfix no-print']]", "ChildRule[AttributeRule]", "21892.857", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='primary_block row']/div[3]", "ParentRule[AttributeRule]", "21892.859", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='primary_block row']/div[3]", "ParentRule[AttributeRule]", "21892.861", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1]", "ChildRule[TagRule]", "21892.863", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1[text()=\"Faded Short Sleeve T-shirts\"]]", "ChildRule[TextRule]", "21892.865", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[text()=\"Warning: Last items in stock!\"]]", "ChildRule[TextRule]", "21892.867", "" ) );


objectMap.put( "21892.799", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
