package codoidinterview;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Uploadfile {
		public static void main(String[] args) throws AWTException   {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();		  
			  driver.get ("http://www.leafground.com/pages/upload.html");
			  
			  
			  WebElement uploadbutton= driver.findElement(By.name("filename"));
			  uploadbutton.click();
			  
			  String file ="D:\\java\\Selenium training\\download.xls";
			  
			  StringSelection selection=new StringSelection(file);
			  
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			  
			  Robot robot= new Robot();
			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  
			  
			  
		}

}
