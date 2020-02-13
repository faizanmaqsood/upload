package masterportal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.java.accessibility.util.Translator;



import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public class audioupload {
	WebElement element;

	public void load(WebDriver driver) throws AWTException

	{
		String url = "https://khushaalzamindar.com/masterportal/login";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("farooq.khan@telenor.com.pk");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("audience");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Khushaal Watan - Backoffice'])[1]/following::button[1]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		driver.findElement(By.linkText("Videos")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='UPLOAD NEW VIDEO'])[1]/following::button[1]")).click();
		
		driver.findElement(By.xpath("//sui-select/i")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Onion'])[1]/following::sui-select-option[1]")).click();
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select Category'])[1]/following::sui-select[1]")).click();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Methods Of Irrigation'])[1]/following::sui-select-option[1]")).click();
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	    
	    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	    //Date date = calendar.getTime();
	    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	    int year = calendar.get(Calendar.YEAR);
	    
	    String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
	    
	    HashMap<String, String> hmap = new HashMap<String, String>();
	    
	    hmap.put("January" , "جنوری");
	    hmap.put("February" , "فروری");
	    hmap.put("March" , "مارچ");
	    hmap.put("April" , "اپریل");
	    hmap.put("May" , "مئی");
	    hmap.put("June" , "جون");
	    hmap.put("July" , "جولائی");
	    hmap.put("August" , "اگست");
	    hmap.put("September" , "ستمبر");
	    hmap.put("October" , "اکتوبر");
	    hmap.put("November" , "نومبر");
	    hmap.put("December" , "دسمبر");
	    
	    
 HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
	    
	    hmap2.put(1 , "ایک");
	    hmap2.put(2 , "دو");
	    hmap2.put(3 , "تین");
	    hmap2.put(4 , "چار");
	    hmap2.put(5 , "پانچ");
	    hmap2.put(6 , "چھ");
	    hmap2.put(7 , "سات");
	    hmap2.put(8 , "آٹھ");
	    hmap2.put(9 , "نو");
	    hmap2.put(10 , "دس");
	    hmap2.put(11 , "گیارہ");
	    hmap2.put(12 , "بارہ");
	    hmap2.put(13 , "تیرا");
	    hmap2.put(14 , "چودہ");
	    hmap2.put(15 , "پندرہ");
	    hmap2.put(16 , "سولہ");
	    hmap2.put(17 , "سترہ");
	    hmap2.put(18 , "اٹھارہ");
	    hmap2.put(19 , "انیس");
	    hmap2.put(20 , "بیس");
	    hmap2.put(21 , "اکیس");
	    hmap2.put(22 , "بائیس");
	    hmap2.put(23 , "تیس");
	    hmap2.put(24 , "چوبیس");
	    hmap2.put(25 , "پچیس");
	    hmap2.put(26 , "چھبیس");
	    hmap2.put(27 , "ستائیس");
	    hmap2.put(28 , "اٹھائیس");
	    hmap2.put(29 , "انتیس");
	    hmap2.put(30 , "تیس");
	    hmap2.put(31 , "اکتیس");
	    
	    
	    
	    

        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        String month_ur = hmap.get(month);
        String day_ur = hmap2.get(dayOfMonth);
	    //int month = calendar.get(Calendar.MONTH) + 1;
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(+dayOfMonth+" " +month+ " News Updates");
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click(); 
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys( day_ur +" " + month_ur +" " + "کی خبریں");
	    
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(+dayOfMonth+" " +month+ " News Updates");
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys( day_ur +" " + month_ur +" " + "کی خبریں");
	    
	  //Use robot class to press Ctrl+t keys     
	    Robot robot = new Robot();                          
	    robot.keyPress(KeyEvent.VK_CONTROL); 
	    robot.keyPress(KeyEvent.VK_T); 
	    robot.keyRelease(KeyEvent.VK_CONTROL); 
	    robot.keyRelease(KeyEvent.VK_T);
	    
	  //Switch focus to new tab
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    
	    
	    driver.get("https://drive.google.com/drive/u/0/folders/1LbmoJoK4jsYk8YQf1VDPAQD-m2X80e5W");
	    
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    driver.findElement(By.className("a-ee-zh-k-V-va")).click();
	    
	    //driver.findElement(By.xpath("//div[@id=':u']/div/c-wiz/div[2]/c-wiz/div/c-wiz/div/c-wiz/div/c-wiz[2]/c-wiz/div/c-wiz[2]/div/div/div/div/div/div/div/div")).click();
	   // driver.findElement(By.className("akerZd")).click();
	    

		int count = driver.findElements(By.className("akerZd")).size();
		System.out.println(count);
		count = count-1;
	    
		element = (WebElement) ((RemoteWebDriver) driver)
				.findElementsByClassName("akerZd").get(count);
		element.click();
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    //driver.close();
		
		int count2 = driver.findElements(By.className("Q5txwe")).size();
		System.out.println(count2);
		count2 = count2-1;
		
		element = (WebElement) ((RemoteWebDriver) driver)
				.findElementsByClassName("Q5txwe").get(count2);
	    
		String name = element.getText();
		System.out.println(name);
		
		char ch1 = name.charAt(14);
		char ch2 = name.charAt(15);
		
		String str = String.valueOf(ch1)+String.valueOf(ch2);
		
		System.out.println(str);
		//System.out.println(ch2);
		Calendar cal2 = Calendar.getInstance();
		   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		   System.out.println("Today's date is "+dateFormat.format(cal2.getTime()));

		   cal2.add(Calendar.DATE, -1);
		  // System.out.println("Yesterday's date was "+dateFormat.format(cal2.getTime())); 
		   
		   String yes = dateFormat.format(cal2.getTime());
		   System.out.println(yes);
		   
		   char ch3 = yes.charAt(8);
		   char ch4 = yes.charAt(9);
		  
		   String str2 = String.valueOf(ch3)+String.valueOf(ch4);  
		   System.out.println(str2);
		   
		   if (str.equals(str2))
		   {
	    driver.switchTo().window(tabs.get(0));
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\faizan.maqsood\\Downloads\\"+name);
	    
	    driver.findElement(By.id("add_survey")).click();
	    
	    if (waitForElementPresent(driver, By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='UPLOAD NEW VIDEO'])[1]/following::button[1]"), 90) != null) {

        
	   driver.get("https://khushaalzamindar.com/masterportal/home/(modules:videos)");
	    }
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		   
		
		    driver.findElement(By.xpath("//label")).click();
		   // int count3 = driver.findElements(By.className("toggle ui checkbox ng-untouched ng-pristine ng-valid")).size();
		//	System.out.println(count3);
		    try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		    driver.findElement(By.xpath("//input[@type='text']")).click();
		    driver.findElement(By.xpath("//input[@type='text']")).clear();
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dayOfMonth+" "+month+" "+year+" 12:45 PM");
		    System.out.println(dayOfMonth+" "+month+" "+year+" 12:15 PM");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
	    
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        driver.switchTo().window(tabs.get(1));
	        driver.close();
	        driver.switchTo().window(tabs.get(0));
			//driver.close();
	        
		   }
		   else 
		   {
			   System.out.println("Yesterday's audio file does not exist");
			   driver.close();
			   driver.switchTo().window(tabs.get(0));
//			   
//			   driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
//			   driver.findElement(By.id("identifierId")).sendKeys("khushalzameendar@gmail.com");
//			   driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Learn more'])[1]/following::span[2]")).click();
//			   try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			   driver.findElement(By.name("password")).sendKeys("kz345@2019");
//			   driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Too many failed attempts'])[1]/following::span[8]")).click();
//			  // driver.close();
			   
			   yahoo();
			   		   
			
		   }
				System.out.println("Uploading of audio file testcase executed");
	}

	
	
	
	
	
	
	
	
	
	
	public static WebElement waitForElementPresent(WebDriver driver, final By by, int timeOutInSeconds) {

		WebElement element;

		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify implicitlyWait()

			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(by));

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // reset implicitlyWait
			return element; // return the element
		} catch (Exception e) {

			// e.printStackTrace();

		}
		return null;
	}

	
	
	public void yahoo() throws AWTException
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver2 =  new ChromeDriver(options); 
       // driver2.get("https://accounts.google.com/signin");
      //  new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("khushalzameendar@gmail.com");
       // driver2.findElement(By.id("identifierNext")).click();
        
//        driver2.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1578311025&rver=7.0.6738.0&wp=MBI_SSL&wreply=https:%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefp%253Dsignedout-index%2526refd%253Dwww.google.com&lc=1033&id=292666&lw=1&fl=easi2");
//        driver2.findElement(By.id("i0116")).click();
//        driver2.findElement(By.id("i0116")).sendKeys("khushaalwatan@outlook.com");
//        driver2.findElement(By.id("idSIButton9")).click();
//        driver2.findElement(By.id("i0118")).clear();
//        driver2.findElement(By.id("i0118")).sendKeys("kz345@2019");
//        //driver2.findElement(By.id("idSIButton9")).click();
//        try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        Robot robot = new Robot();                          
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    
//	    driver2.findElement(By.className("c-action-trigger ng-binding x-hidden-focus"));
//	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Portals Navigation'])[1]/following::h3[1]")).click();
//	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
//	    driver2.findElement(By.id("id__3")).click();
//	    driver2.findElement(By.xpath("//input[@value='faizan.maqsood@telenor.com.pk']")).click();
//	    driver2.findElement(By.xpath("//input[@value='faizan.maqsood@telenor.com.pk']")).clear();
//	    driver2.findElement(By.xpath("//input[@value='faizan.maqsood@telenor.com.pk']")).sendKeys("faizan.maqsood@telenor.com.pk");
//	    driver2.findElement(By.id("subjectLine0")).click();
//	    driver2.findElement(By.id("subjectLine0")).clear();
//	    driver2.findElement(By.id("subjectLine0")).sendKeys("KW-file-upload-Status");
//	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bcc'])[1]/following::div[8]")).click();
   
	    
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("k");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("z");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("3");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("4");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("5");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("@");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("2");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("0");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("1");
//        new WebDriverWait(driver2, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("9");
   
        driver2.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https://www.yahoo.com");
        driver2.manage().window().maximize();
        driver2.findElement(By.id("login-username")).click();
        driver2.findElement(By.id("login-username")).clear();
        driver2.findElement(By.id("login-username")).sendKeys("khushaalwatan@yahoo.com");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //robot.delay(200);

	    
	  
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //driver2.findElement(By.linkText("Next")).click();
//        WebElement el = driver2.findElement(By.xpath("//*[@id='login-signin']"));
//        el.click();
        //driver2.findElement(By.className("orko-button-primary orko-button challenge-button")).click();
        driver2.findElement(By.id("login-passwd")).clear();
        driver2.findElement(By.id("login-passwd")).sendKeys("kz345@2019");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    driver2.get("https://mail.yahoo.com/d/folders/1?.src=fp");
        
	    driver2.findElement(By.linkText("Compose")).click();
	    
	    
	    driver2.findElement(By.id("message-to-field")).click();
	    driver2.findElement(By.id("message-to-field")).sendKeys("faizan.maqsood@telenor.com.pk;Muwahid.Iqbal@telenor.com.pk");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	   // driver2.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[3]/div/div/input")).click();
	    driver2.findElement(By.xpath("(//input[@value=''])[5]")).sendKeys("KW File Upload Status");
	    
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CC / BCC'])[1]/following::div[10]")).click();
        
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CC / BCC'])[1]/following::div[10]")).sendKeys("System is unable to upload audio file due to wrong format or yesterday's audio file is not available");
        
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CC / BCC'])[1]/following::button[1]")).click();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver2.close();
	
	}
	
	

}
