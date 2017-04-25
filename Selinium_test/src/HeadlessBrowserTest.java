import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HeadlessBrowserTest{

	public static void main(String[] args)throws Exception {
		WebDriver headLess = new HtmlUnitDriver();
		headLess.get("https://www.facebook.com");
		//TakesScreenshot ts = (TakesScreenshot)headLess;
		//File file = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File("./screenshots/esi.png"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"G:/JARS/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver(caps);
		
		driver.get("https://www.google.com");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./screenshots/esi.png"));
		System.out.println(headLess.getTitle());
	}

}
