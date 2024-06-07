package automation;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BlogTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void view() {
    driver.get("https://learnernpoint.blogspot.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Data Visualization with Tableau")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".back-button > .svg-icon-24")).click();
    driver.findElement(By.linkText("Python - Assessments")).click();
    js.executeScript("window.scrollTo(0,2577.60009765625)");
    js.executeScript("window.scrollTo(0,1875.199951171875)");
    js.executeScript("window.scrollTo(0,2270.39990234375)");
    js.executeScript("window.scrollTo(0,9102.400390625)");
    driver.findElement(By.linkText("Angel One Trading Platform: A Comprehensive Review")).click();
    js.executeScript("window.scrollTo(0,1799.199951171875)");
    driver.findElement(By.cssSelector("center:nth-child(11) p")).click();
    driver.findElement(By.linkText("Unlocking the Power of Algorithmic Trading: Strategies, Risks, and Benefits")).click();
    js.executeScript("window.scrollTo(0,2472)");
    driver.findElement(By.cssSelector("center:nth-child(15) p")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".blog-pager-older-link"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".blog-pager-older-link")).click();
    driver.findElement(By.linkText("Trading as a Business: Strategies for Day Trading, Option Trading, and Investment")).click();
    js.executeScript("window.scrollTo(0,1219.199951171875)");
    js.executeScript("window.scrollTo(0,2311.199951171875)");
    driver.findElement(By.cssSelector("center:nth-child(15) p")).click();
    driver.findElement(By.linkText("Mastering Option Trading: Choosing the Right Strike Price for Profit 🚀💹")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("center:nth-child(15) p"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("center:nth-child(15) p")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Exploring the World of Trading: Strategies, Risks, and Future Trends")).click();
    vars.put("win1854", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win1854").toString());
    js.executeScript("window.scrollTo(0,1861.5999755859375)");
    driver.findElement(By.cssSelector("center:nth-child(12) p")).click();
    driver.switchTo().window(vars.get("root").toString());
    {
      WebElement element = driver.findElement(By.linkText("Unlocking the Secrets of Option Chain Analysis | A Comprehensive Guide"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Unlocking the Secrets of Option Chain Analysis | A Comprehensive Guide")).click();
    js.executeScript("window.scrollTo(0,460.79998779296875)");
    js.executeScript("window.scrollTo(0,943.2000122070312)");
    js.executeScript("window.scrollTo(0,1339.199951171875)");
    js.executeScript("window.scrollTo(0,1008)");
    js.executeScript("window.scrollTo(0,1556.800048828125)");
    js.executeScript("window.scrollTo(0,2005.5999755859375)");
    driver.findElement(By.cssSelector("center:nth-child(15) p")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".overflowable-container > .overflowable-contents .overflowable-item:nth-child(1) > a")).click();
    {
      WebElement element = driver.findElement(By.linkText("Data Visualization with Tableau"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Best Selling Products")).click();
    vars.put("win6195", waitForWindow(2000));
    driver.switchTo().window(vars.get("win6195").toString());
    driver.switchTo().window(vars.get("root").toString());
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("100 Best Shoes")).click();
    vars.put("win3269", waitForWindow(2000));
    driver.switchTo().window(vars.get("win3269").toString());
    driver.switchTo().window(vars.get("root").toString());
    js.executeScript("window.scrollTo(0,1938.4000244140625)");
    driver.findElement(By.cssSelector(".blog-pager-older-link")).click();
    js.executeScript("window.scrollTo(0,1600.800048828125)");
    {
      WebElement element = driver.findElement(By.cssSelector(".post-outer-container:nth-child(6) .jump-link > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".jump-link > a:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("center:nth-child(8) p")).click();
  }
}


// import java.time.Duration;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.JavascriptExecutor;

// class Scrollpage{
// 	void scroll(WebDriver driver) {
		
// 		WebElement footer = driver.findElement(By.tagName("footer"));
//         int deltaY = footer.getRect().y;
//         new Actions(driver)
//                 .scrollByAmount(0, deltaY)
//                 .perform();
// 	}
// }

// class page1 {
//     void page(WebDriver driver) throws InterruptedException 
//  { 
	
// 	  WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//       blog1.click();
//      System.out.println("Blog1 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[2]/div/div/h3"));        
//     blog2.click();
//     System.out.println("Blog2 clicked");
//     Thread.sleep(1500);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[3]/div/div/h3"));        
//     blog3.click();
//     System.out.println("Blog3 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog4 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[4]/div/div/h3"));        
//     blog4.click();
//     System.out.println("Blog4 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog5 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[5]/div/div/h3"));        
//     blog5.click();
//     System.out.println("Blog5 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog6 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[6]/div/div/h3"));        
//     blog6.click();
//     System.out.println("Blog6 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//      WebElement more_post = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));        
//      more_post.click();
// 	}
	
// }

// class page4 {
//     void pg4(WebDriver driver) throws InterruptedException 
//  { 
//     	System.out.println("Page 4 loaded");
// 	  WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//       blog1.click();
//      System.out.println("Blog1 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[2]/div/div/h3"));        
//     blog2.click();
//     System.out.println("Blog2 clicked");
//     Thread.sleep(1500);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[3]/div/div/h3"));        
//     blog3.click();
//     System.out.println("Blog3 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog4 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[4]/div/div/h3"));        
//     blog4.click();
//     System.out.println("Blog4 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement more_post = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));        
//     more_post.click();
//  }
// }


// class page5 {
//     void pg5(WebDriver driver) throws InterruptedException 
//  { 
//     	System.out.println("Page 5 loaded");
// 	  WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//       blog1.click();
//      System.out.println("Blog1 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement more_post = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));        
//     more_post.click();
//  }
// }

// class page6 {
//     void pg6(WebDriver driver) throws InterruptedException 
//  { 
//     	System.out.println("Page 6 loaded");
// 	  WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//       blog1.click();
//      System.out.println("Blog1 clicked");
//     Thread.sleep(15000);
//     new Scrollpage().scroll(driver);
//     Thread.sleep(2000);
//     driver.navigate().back();
//     System.out.println("Back to Home");
//     WebElement blog2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//     blog2.click();
//    System.out.println("Blog2 clicked");
//   Thread.sleep(15000);
//   new Scrollpage().scroll(driver);
//   Thread.sleep(2000);
//   driver.navigate().back();
//   System.out.println("Back to Home");
//     WebElement more_post = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));        
//     more_post.click();
//  }
// }

// class page7 {
//     void pg7(WebDriver driver) throws InterruptedException 
//  { 
//     	System.out.println("Page 7 loaded");
//     	 WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//          blog1.click();
//         System.out.println("Blog1 clicked");
//        Thread.sleep(15000);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement blog2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[2]/div/div/h3"));        
//        blog2.click();
//        System.out.println("Blog2 clicked");
//        Thread.sleep(1500);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement blog3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[3]/div/div/h3"));        
//        blog3.click();
//        System.out.println("Blog3 clicked");
//        Thread.sleep(15000);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement blog4 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[4]/div/div/h3"));        
//        blog4.click();
//        System.out.println("Blog4 clicked");
//        Thread.sleep(15000);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement more_post = driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a"));        
//        more_post.click();
//  }
// }

// class page8 {
//     void pg8(WebDriver driver) throws InterruptedException 
//  { 
//     	System.out.println("Page 8 loaded");
//     	 WebElement blog1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div/h3"));
//          blog1.click();
//         System.out.println("Blog1 clicked");
//        Thread.sleep(15000);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement blog2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[2]/div/div/h3"));        
//        blog2.click();
//        System.out.println("Blog2 clicked");
//        Thread.sleep(1500);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//        WebElement blog3 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[3]/div/div/h3"));        
//        blog3.click();
//        System.out.println("Blog3 clicked");
//        Thread.sleep(15000);
//        new Scrollpage().scroll(driver);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        System.out.println("Back to Home");
//     driver.navigate().to("https://learnernpoint.blogspot.com/");
//  }
// }


// public class view {
//     public static void main(String[] args) throws InterruptedException {
//         // Set the system property to the location of the ChromeDriver executable
//         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

//         // Create an instance of ChromeDriver (this will open the Chrome browser)
//         WebDriver driver = new ChromeDriver();

//         // Navigate to a website
//         driver.manage().window().maximize();
//         driver.get("https://learnernpoint.blogspot.com/");
//         System.out.println("Home Page loaded");
//       //Page 1 to 3
//         page1 pg = new page1();
//         pg.page(driver);
//         System.out.println("Page 2 loaded");
//         pg.page(driver);
//         System.out.println("Page 3 loaded");
//         pg.page(driver);
//         //Page 4
//         page4 pg4 = new page4();
//         pg4.pg4(driver);
//         //Page 
//         page5 pg5 = new page5();
//         pg5.pg5(driver);
//         //Page 6
//         page6 pg6 = new page6();
//         pg6.pg6(driver);
//         //Page 7 
//         page7 pg7 = new page7();
//         pg7.pg7(driver);
//         //Page 8
//         page8 pg8 = new page8();
//         pg8.pg8(driver);
//         // Close the browser
//         driver.quit();
//     }
// }
