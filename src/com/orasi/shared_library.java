/**
 * @version 3
 *
 */
 package com.orasi;
 
 import java.util.*;
 import java.util.function.*;
 import java.io.*;
 import java.lang.reflect.*;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.openqa.selenium.*;
 import org.openqa.selenium.interactions.*;
 import org.openqa.selenium.remote.*;
 import org.openqa.selenium.support.ui.*;
 import java.util.regex.*;
 import com.orasi.datasource.*;
 import com.orasi.alchemy.mediation.execution.*;
 import java.util.concurrent.atomic.AtomicInteger;
 import com.orasi.event.*;
 import com.orasi.event.chain.*;
 import com.orasi.event.handler.EventHandler;
 import com.orasi.model.*;
 import java.time.*;
 
 public class shared_library
 {
    private static Logger log = LoggerFactory.getLogger(shared_library.class );
 
    private static final Pattern CONTEXT_REGEX = Pattern.compile( "\\$\\{([^}]*)\\}" );
 

    private static final AtomicInteger testCounter = new AtomicInteger();
    private static final AtomicInteger stepCounter = new AtomicInteger();

    public static final int getTestCounter() {
      return testCounter.incrementAndGet();
    }

    public static final int getStepCounter() {
      return stepCounter.incrementAndGet();
    }
 

 private static EventChain eventChain = new EventChain();

 public static void addEventHandler( EventHandler eventHandler ) {
   eventHandler.setEventChain(eventChain);
   eventChain.addEventHandler(eventHandler);
 }

 public static void notifyListeners( Event e ) {
   
   eventChain.handle( e );
 }

  private static List<Throwable> getThrowableList(Throwable throwable) {
    final List<Throwable> list = new ArrayList<>();
    while (throwable != null && !list.contains(throwable)) {
      list.add(throwable);
      throwable = throwable.getCause();
    }
    return list;
  }

  private static Throwable getRootCause(final Throwable throwable) {
    final List<Throwable> list = getThrowableList(throwable);
    return list.isEmpty() ? throwable : list.get(list.size() - 1);
  }

 
 
 
 public static void Click_v7( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   String method = (String) variableMap.get( "method" );
 

   if ( method != null && !method.isEmpty() ) {    
 
 try {
   switch (method) {
         case "Default":
           try {
             WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofSeconds( 8 ), Duration.ofMillis( 250 ) );
             wait.until( (_wD) -> ExpectedConditions.elementToBeClickable( targetLocator ).apply( _wD )).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "No Wait":
           try {
             webDriver.findElement(targetLocator).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "Simple":
           webDriver.findElement(targetLocator).click();
           break;
         case "Right":
           Actions rC = new Actions(webDriver);
           rC.contextClick(webDriver.findElement(targetLocator)).perform();
           break;
         case "Double": 
           Actions dC = new Actions(webDriver);
           dC.doubleClick(webDriver.findElement(targetLocator)).perform();
           break;
         default:
           throw new IllegalArgumentException("Invalid method specified as " + method );
       }
     } catch( Exception e ) {
       throw new IllegalArgumentException( "Could not locate element defined by targetLocator" );
     }
 
   } else {
     throw new IllegalArgumentException("The METHOD parameter must be specified");
   }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Sends the supplied key sequence to the selected element simulating the Control, Shift, and Alt keys as necessary
 */
 public static void Keys_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   Boolean Control = Boolean.parseBoolean( variableMap.get( "Control" ) + "" );
 
   Boolean Shift = Boolean.parseBoolean( variableMap.get( "Shift" ) + "" );
 
   Boolean Alt = Boolean.parseBoolean( variableMap.get( "Alt" ) + "" );
 
   String Key = (String) variableMap.get( "Key" );
 

 Actions keyActions = new Actions( webDriver );

if ( Control != null && Control.booleanValue() ) {
  keyActions.keyDown( Keys.CONTROL );
}

if ( Shift != null && Shift.booleanValue() ) {
  keyActions.keyDown( Keys.SHIFT );
}

if ( Alt != null && Control.booleanValue() ) {
  keyActions.keyDown( Keys.ALT );
}

try {
  Keys useKey = Keys.valueOf( Key );
  keyActions.sendKeys( useKey );
} catch( Exception e ) {
  keyActions.sendKeys( Key );
}

keyActions.build().perform();


boolean runAgain = false;
if ( Control != null && Control.booleanValue() ) {
  keyActions.keyUp( Keys.CONTROL );
  runAgain = true;
}

if ( Shift != null && Shift.booleanValue() ) {
  keyActions.keyUp( Keys.SHIFT );
  runAgain = true;
}

if ( Alt != null && Control.booleanValue() ) {
  keyActions.keyUp( Keys.ALT );
  runAgain = true;
}

if ( runAgain ) {
  keyActions.build().perform();
}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Navigate_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String url = (String) variableMap.get( "url" );
 
   Long timeout = null;
   Number _timeout = (Number) variableMap.get( "timeout" );
   if ( _timeout != null ) timeout = _timeout.longValue();
 

 webDriver.manage().timeouts().pageLoadTimeout( timeout.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS ); webDriver.get( url ); 
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version implemented Maximize, Minimize, Full Screen, Resize and Close
 */
 public static void Browser_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String action = (String) variableMap.get( "action" );
 
   Long height = null;
   Number _height = (Number) variableMap.get( "height" );
   if ( _height != null ) height = _height.longValue();
 
   Long width = null;
   Number _width = (Number) variableMap.get( "width" );
   if ( _width != null ) width = _width.longValue();
 

 switch( action ) {
  case "Back":
    webDriver.navigate().back();
    break;
  case "Forward":
    webDriver.navigate().forward();
    break;
  case "Refresh":
    webDriver.navigate().refresh();
    break;
  case "Maximize":
    webDriver.manage().window().maximize();
    break;
  case "Minimize":
    webDriver.manage().window().minimize();
    break;
  case "Full Screen":
    webDriver.manage().window().fullscreen();
    break;
  case "Resize":
    webDriver.manage().window().setSize( new Dimension( width.intValue(), height.intValue() ) );
    break;
  case "Close":
   String windowHandle = webDriver.getWindowHandle();
   String baseWindowHandle = webDriver.getWindowHandles().toArray()[ 0 ] + "";
   
   if ( !windowHandle.equals(baseWindowHandle) ) {
     webDriver.switchTo().window( windowHandle );
     webDriver.close();
     webDriver.switchTo().window( baseWindowHandle );
   } else {
     throw new IllegalArgumentException( "You can not close the default window" );
   }
}

if ( contextName != null ) {
  contextMap.put( contextName, webDriver.getCurrentUrl() );
}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version will check after the clear to verify that the input is empty.  If not, it will send backspace keys for each character in the input
 */
 public static void Type_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   Boolean clearFirst = Boolean.parseBoolean( variableMap.get( "clearFirst" ) + "" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 WebElement targetElement;
targetElement = webDriver.findElement(targetLocator);

if ( targetElement == null ) {
  throw new IllegalArgumentException( "Unable to locate " + targetLocator );
}

if ( clearFirst ) {   
  targetElement.clear(); 
  String text = targetElement.getAttribute( "value" );
  if ( text != null ) {
    for ( int i=0; i<text.length(); i++ ) {
      targetElement.sendKeys(Keys.BACK_SPACE);
    } 
  }
}  

targetElement.sendKeys( value );


 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Change_Frame_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Method = (String) variableMap.get( "Method" );
 
   Long Index = null;
   Number _Index = (Number) variableMap.get( "Index" );
   if ( _Index != null ) Index = _Index.longValue();
 
   String Name = (String) variableMap.get( "Name" );
 
   By Locator = (By) variableMap.get( "Locator" );
 
   String ID = (String) variableMap.get( "ID" );
 

 if ( Method == null ) {
  throw new IllegalArgumentException( "Method must be specified" );
}

switch( Method ) {
  case "Locator":
    if ( Locator == null ) {
      throw new IllegalArgumentException( "Locator is required when searching for a frame by a locator" );
    }

    WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofMillis( 2500 ), Duration.ofMillis( 250 ) );

    WebElement frameElement = wait.until( new Function<WebDriver, WebElement>()
    {
      @Override
      public WebElement apply( WebDriver webDriver )
      {
        try {
          WebElement webElement = webDriver.findElement( Locator );
          webDriver.switchTo().frame( webElement );
          return webElement;
        } catch ( Exception e ) {  
          return null;
        }
      }
     } );
     break;

  case "Index":
    if ( Index == null ) {
      throw new IllegalArgumentException( "Index is required when searching for a frame by index" );
    }
    webDriver.switchTo().frame( Index.intValue() );
    break;
  case "Name":
    if ( Name == null ) {
      throw new IllegalArgumentException( "Name is required when searching for a frame by name" );
    }
    webDriver.switchTo().frame( Name );
    break;
  case "ID":
    if ( ID == null ) {
      throw new IllegalArgumentException( "ID is required when searching for a frame by id" );
    }
    webDriver.switchTo().frame( ID );
    break;
  case "Parent":
    webDriver.switchTo().parentFrame();
    break;
}

 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This implementation will select a value based off of the method.  The default method will select by search that the value contains the provided text.  If not found, it will select by visible value, otherwise by value.  The Visible method only search by visible value and the Value method only selects by value
 */
 public static void Select_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String method = (String) variableMap.get( "method" );
 
   String value = (String) variableMap.get( "value" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 
WebElement targetElement;
try {
      targetElement = webDriver.findElement(targetLocator);

    } catch (Exception e) {
      throw new IllegalArgumentException( "Unable to locate element", e );
    }

if ( method == null ||  method.equals( "Default" ) ) {
  Select selectElement = new Select(targetElement);
  if (selectElement.isMultiple()) {
    selectElement.deselectAll();
  }

  List<WebElement> selectOptions = selectElement.getOptions();
  boolean found = false;
  for (int i = 0; i < selectOptions.size(); i++) {
    if (selectOptions.get(i).getText().contains(value)) {
      selectElement.selectByIndex(i);
      found = true;
    }
  }

  if (!found) {
    try {
      selectElement.selectByVisibleText(value);
    } catch (Exception e) {
      selectElement.selectByValue(value);
    }
  }
} else if ( method.equals( "Visible" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByVisibleText( value );
} else if ( method.equals( "Value" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByValue( value );
}
    

 if ( variableMap != null ) {
   variableMap.clear();
 }
}


 }
