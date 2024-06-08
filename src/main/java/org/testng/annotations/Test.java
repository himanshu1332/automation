package org.testng.annotations;
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
public @interface Test {
{
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
}
