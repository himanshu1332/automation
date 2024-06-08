package automation;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

class Scrollpage{
	void scroll(WebDriver driver) {
		
		WebElement footer = driver.findElement(By.tagName("footer"));
        int deltaY = footer.getRect().y;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();
	}
}

class views{
	void views1(WebDriver driver) throws InterruptedException 
{
	for(int i =0;i<=100;i++) {
  	  for (int j = 1; j <= 14; j++) {
            // Dynamically generate the XPath for each element
            String xpath = "//*[@id=\"post-toc\"]/div[" + j + "]/a";
            try {
                // Find the element and click on it
                WebElement element = driver.findElement(By.xpath(xpath));
                element.click();
                System.out.println("Link " + j + " clicked");
                Thread.sleep(3000);
                // Get the current window handles
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                // Switch back to the original tab
                driver.switchTo().window(tabs.get(0));
                // Optionally, wait for some time before clicking the next link
                Thread.sleep(5000); // wait for 5 second
            } catch (Exception e) {
                System.out.println("Link " + j + " not found or could not be clicked");
            }
  	  }
  	  // Close all remaining tabs except the first one
        ArrayList<String> remainingTabs = new ArrayList<>(driver.getWindowHandles());
        for (int k = 1; k < remainingTabs.size(); k++) {
            driver.switchTo().window(remainingTabs.get(k));
            driver.close();
        }
        // Switch back to the first tab
        driver.switchTo().window(remainingTabs.get(0));
        Thread.sleep(3000);
  	  System.out.println("Iteration "+i);
   }
	}

}
public class view{
    public static void main(String[] args) throws InterruptedException {
        // Set the system property to the location of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Create an instance of ChromeDriver (this will open the Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.manage().window().maximize();
//        driver.get("https://learnernpoint.blogspot.com/");
//        System.out.println("Home Page loaded");
//      //Page 1 to 3
//        driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article[1]/div/div")).click();
//        System.out.println("Deals link clicked");
//        Thread.sleep(2000);
        driver.get("https://learnernpoint.blogspot.com/2024/06/deals.html");
     views vw = new views();
     vw.views1(driver);
    	  
//    	   Close the browser
           driver.quit();
      
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
