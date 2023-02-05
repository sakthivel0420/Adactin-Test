package com.cucumber_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base_class {
	public static WebDriver driver;
	

	public static WebDriver callBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",
		System.getProperty("user.dir") + "\\Chrome_Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
		return driver;
		}
		public static void click(WebElement driver) {
		driver.click();
		}
		public static void send(WebElement element, String val) {
		element.sendKeys(val);
		}
		public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
		}
		public static void radiobut(WebElement element) {
		element.click();
		}
		public static void Navito(String url) {
		driver.navigate().to(url);
		}
		public static void alert(String text) {
		if (text.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		}
		else if (text.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
		}}
		public static void alertsendkeys(String word) {
		driver.switchTo().alert().sendKeys(word);
		}
		public static void getURL(String url) {
		driver.get(url);
		}
		public static void navigate(String text) {
		if(text.equalsIgnoreCase("back")) {
		driver.navigate().back();
		}
		else if(text.equalsIgnoreCase("forward")) {
		driver.navigate().forward();
		}
		else if(text.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
		}}
		public static void Quit() {
		driver.quit();
		}
		public static void close() {
		driver.close();
		}
		public static void selected(WebElement element , String name)
		{
		if(name.equalsIgnoreCase("isselected")) {
		element.isSelected();
		}
		else if(name.equalsIgnoreCase("is dislayed")) {
		element.isDisplayed();
		}else if(name.equalsIgnoreCase("is enabled")) {
		element.isEnabled();
		}}
		public static void getwindowhandle(String text) {
		if(text.equalsIgnoreCase("getwindowhandle")) {
		String windowhandle = driver.getWindowHandle();
		System.out.println(driver.switchTo().window(windowhandle).getTitle());
		}
		else if(text.equalsIgnoreCase("getwindowhandles")) {
		Set<String> handles = driver.getWindowHandles();
		for (String s : handles) {
		System.out.println("I'D NAMES :"+" "+driver.switchTo().window(s).getTitle());
		}}}
		public static void get(String text) {
		if(text.equalsIgnoreCase("getTitle")) {
		driver.getTitle();
		 }else if(text.equalsIgnoreCase("get current url")) {
		driver.getCurrentUrl();
		}else if(text.equalsIgnoreCase("getpagesource")) {
		driver.getPageSource();
		}}
		public static void frame(WebElement element ) {
		driver.switchTo().frame(element);
		}
		public static void framedef_or_par(String name) {
		if(name.equalsIgnoreCase("frameback")) {
		 driver.switchTo().defaultContent();
		}
		else if(name.equalsIgnoreCase("parentframe")) {
		driver.switchTo().parentFrame();
		}}
		public static void maximizeScreen() {
		driver.manage().window().maximize();
		}
		public static void waitlaod() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		public static void callscreenshot() throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File destignation = new File("C:\\Users\\sakthi vel\\eclipse-workspace\\cucumber_project\\sc_cum");
		FileUtils.copyFile(screenshotAs, destignation);
		}
		public static void dropdown(String text , WebElement element ,
		String word ) {
		Select s = new Select(element);
		if(text.equalsIgnoreCase("visible text")) {
		s.selectByVisibleText(word);
		}
		else if(text.equalsIgnoreCase("value")) {
		s.selectByValue(word);
		} else if (text.equalsIgnoreCase("text")) {
		int parseInt = Integer.parseInt(word);
		s.selectByIndex(parseInt);
		}}
		public static void multidropdown(WebElement element) {
		Select d = new Select(element);
		boolean multiple2 = d.isMultiple();
		System.out.println(multiple2);
		List<WebElement> options = d.getOptions();
		for (WebElement A : options) {
		System.out.println(A.getText());
		}}
		public static void javascript(WebElement element , String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(name.equalsIgnoreCase("scrollIntoView")) {
		js.executeScript("arguments[0].scrollIntoView();",element);
		}
		else if(name.equalsIgnoreCase("click")) {
		js.executeScript("argument[0].click();", element);
		}
		else if(name.equalsIgnoreCase("title")) {
		js.executeScript("return document.title;").toString();
		}
		else if(name.equalsIgnoreCase("domain name")) {
		js.executeScript("return document.domain;").toString();
		}
		else if(name.equalsIgnoreCase("url")) {
		js.executeScript("return document.url;").toString();
		}}
		public static void action(WebElement element , String name) {
		Actions A = new Actions(driver);
		if(name.equalsIgnoreCase("movetoelement")) {
		A.moveToElement(element).build().perform();
		}
		else if(name.equalsIgnoreCase("click")) {
		A.click(element).build().perform();
		}
		else if(name.equalsIgnoreCase("contextclick")) {
		A.contextClick(element).build().perform();
		}
		else if(name.equalsIgnoreCase("double click")) {
		A.doubleClick(element).build().perform();
		 }
		else if(name.equalsIgnoreCase("click and hold"))
		A.clickAndHold(element).build().perform();
		}
		
		 

		public static void robot() throws AWTException {
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void main(String[] args) throws IOException,
		InterruptedException, AWTException {
		navigate(null);
		getURL(null);
		Quit();
		close();
		click(null);
		send(null, null);
		radiobut(null);
		Navito(null);
		callBrowser(null);
		callscreenshot();
		getwindowhandle(null);
		frame(null);
		framedef_or_par(null);
		maximizeScreen();
		alert(null);
		waitlaod();
		sleep();
		action(null, null);
		robot();
		javascript(null, null);
		dropdown(null, null, null);
		selected(null, null);
		 getwindowhandle(null);
		 multidropdown(null);
	
		}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


