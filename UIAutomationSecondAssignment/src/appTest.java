import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class appTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String chromePath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        WebDriver browser = new ChromeDriver();
        
        browser.navigate().to("https://www.google.com/?hl=en");
        
        browser.findElement(By.id("gb_70")).click();
        browser.findElement(By.cssSelector("button[jsname=\"Cuz2Ue\"]")).click();
        String actualURL =browser.getCurrentUrl();
        //System.out.println(actualURL);
        if (actualURL.contains("signin/v2/username")) {
        	System.out.println("Test Case is passed");
        }
        else 
        	System.out.println("Test Case is failed");
        	
        browser.quit();
        
        
        
	}

}
