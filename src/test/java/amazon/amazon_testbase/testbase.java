    package amazon.amazon_testbase;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class testbase {
		public static WebDriver driver;
		 public static Properties prop;
		
		public  void initialization() throws IOException, InterruptedException  {
			try {
				//read the file
			FileInputStream fs = new FileInputStream("D:\\WORKSPACE\\amazon_testcases\\src\\test\\java\\Config.properties");
			prop = new Properties();
			prop.load(fs);
			WebDriverManager.chromedriver().setup();
			 ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			 driver = new ChromeDriver(chromeOptions);
			 //properties object can be used to fetch the value using getProperty method
			 Thread.sleep(300);
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			}
			catch (FileNotFoundException e) {
				System.out.println("File not available");
			}
			
		}
		
		public void terminate() {
			 driver.quit();
		}

	}



