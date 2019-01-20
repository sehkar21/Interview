package interviewquestions;

public class Interview {
	Important topics for interviews(only written):
		===============================================
		COREJAVA:
		----------
		1.Inheritance(Single,Multilevel):
		---------------------------------------
		Single Inheritance:
		----------------------
		public class A {
			public void test1() {
				System.out.println("test1");

			}

		}


		public class B extends A {
			public void test2() {
				System.out.println("test2");
			}

			public static void main(String[] args) {
				B b1 = new B();
				b1.test1();
				b1.test2();
			}

		}

		Multilevel Inheritance:
		-----------------------

		public class C {
			public void test3() {
				System.out.println("test3");
			}

		}



		public class A extends C {
			public void test1() {
				System.out.println("test1");

			}

		}



		public class B extends A {
			public void test2() {
				System.out.println("test2");
			}

			public static void main(String[] args) {
				B b1 = new B();
				b1.test1();
				b1.test2();
				b1.test3();
			}

		}






		2.Polymorphism(Method overloading,Method overriding):
		----------------------------------------------------------
		Method overloading:
		---------------------


		public class Employee {
			public void findEmpId(int age) {
				System.out.println("123");
			}

			public void findEmpId() {
				System.out.println("123");
			}

			public static void main(String[] args) {
				Employee e = new Employee();
				e.findEmpId();
				e.findEmpId(765);
			}

		}


		Method overriding:
		---------------------

		public class AxisBank {
			public void fixedDeposite() {
				System.out.println("5%");

			}

		}



		public class HDFCBank extends AxisBank {
			public void fixedDeposite() {
				System.out.println("10%");

			}

			public static void main(String[] args) {
				AxisBank bank = new HDFCBank();
				bank.fixedDeposite();

			}

		}


		3.Abstarctions(interface,abstarct class,multiple inheritance through interface):
		-----------------------------------------------------------------------------------
		Abstract class:
		----------------

		public abstract class Bank {
			public abstract void savingAcct();

			public abstract void currentAcct();

			public void branchDetails() {
				System.out.println("Chennai");
			}

		}



		public class HDFCBank extends Bank {

			public void savingAcct() {
				System.out.println("6%");

			}

			public void currentAcct() {
				System.out.println("8%");
			}

			public static void main(String[] args) {
				Bank b = new HDFCBank();
				b.savingAcct();
				b.currentAcct();
				b.branchDetails();
			}

		}



		public class AxisBank extends Bank {

			public void savingAcct() {
				System.out.println("5%");

			}

			public void currentAcct() {
				System.out.println("10%");
			}

			public static void main(String[] args) {
				Bank b = new AxisBank();
				b.savingAcct();
				b.currentAcct();
				b.branchDetails();
			}

		}

		Interface:
		------------


		public interface Bank {
			public abstract void savingAcct();

			public void currentAcct();

		}


		public class HDFCBank implements Bank {

			public void savingAcct() {
				System.out.println("6%");

			}

			public void currentAcct() {
				System.out.println("8%");
			}

			public static void main(String[] args) {
				Bank b = new HDFCBank();
				b.savingAcct();
				b.currentAcct();
			}

		}




		public class AxisBank implements Bank {

			public void savingAcct() {
				System.out.println("5%");

			}

			public void currentAcct() {
				System.out.println("10%");
			}

			public static void main(String[] args) {
				Bank b = new AxisBank();
				b.savingAcct();
				b.currentAcct();
			}

		}


		Multiple Inheritance through Interface:
		----------------------------------------

		public interface I1 {
			void test1();
		}


		public interface I2 {
			void test2();
		}


		public class C implements I1, I2 {

			public void test2() {
				System.out.println("test2");
			}

			public void test1() {
				System.out.println("test1");
			}

			public static void main(String[] args) {
				C c1 = new C();
				c1.test1();
				c1.test2();
			}

		}



		4.Insert values in list/userdefine and iterate values using foreach/for:
		--------------------------------------------------------------------------
		Insert values in List:
		----------------------
		import java.util.ArrayList;
		import java.util.List;

		public class Employee {
			public static void main(String[] args) {
				List<Integer> emp = new ArrayList<>();
				emp.add(12);
				emp.add(122);
				emp.add(123);
				emp.add(124);
				emp.add(125);

				// for loop

				for (int i = 0; i < emp.size(); i++) {
					System.out.println(emp.get(i));
				}

				// Enhanced for loop
				for (Integer i : emp) {
					System.out.println(i);

				}
			}

		}


		Insert values in List with userdefine list:
		----------------------------------------------

		public class Employee {
			private int id;
			private String name;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

		}



		import java.util.ArrayList;
		import java.util.List;

		public class Details {
			public static void main(String[] args) {
				List<Employee> emp = new ArrayList<>();

				Employee e1 = new Employee();
				e1.setId(12);
				e1.setName("Vel");

				Employee e2 = new Employee();
				e2.setId(13);
				e2.setName("Bala");

				emp.add(e1);
				emp.add(e2);

				for (Employee x : emp) {
					System.out.println(x.getId());
					System.out.println(x.getName());
				}

			}

		}

		5.Insert values in Map/userdefine Map and iterate values:
		---------------------------------------------------------
		Insert the values in Map:
		----------------------------
		package org.cts.toyota.login;

		import java.util.HashMap;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Set;

		public class Details {
			public static void main(String[] args) {

				Map<Integer, String> emp = new HashMap<>();
				emp.put(10, "Selenium");
				emp.put(20, "Webdriver");
				emp.put(30, "Junit");
				emp.put(40, "TestNG");
				emp.put(50, "SQL");
				Set<Entry<Integer, String>> e = emp.entrySet();
				for (Entry<Integer, String> x : e) {
					System.out.println(x.getKey());
					System.out.println(x.getValue());

				}

			}

		}

		Insert the values in userdefine Map:
		---------------------------------------


		public class Employee {
			private int id;
			private String name;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

		}



		import java.util.HashMap;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Set;

		public class Details {
			public static void main(String[] args) {

				Map<Integer, Employee> emp = new HashMap<>();

				Employee e1 = new Employee();
				e1.setId(12);
				e1.setName("bala");

				Employee e2 = new Employee();
				e2.setId(312);
				e2.setName("Guna");

				emp.put(10, e1);
				emp.put(20, e2);

				Set<Entry<Integer, Employee>> e = emp.entrySet();
				for (Entry<Integer, Employee> x : e) {
					System.out.println(x.getKey());
					System.out.println(x.getValue().getId());
					System.out.println(x.getValue().getName());
				}

			}

		}



		6.JDBC connection steps code:
		-----------------------------

		JDBC connection steps:
		-----------------------
		package org.cts.toyota.login;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;

		public class Details {
			public static void main(String[] args) {
				Connection con = null;
				try {
					// load the driver
					Class.forName("com.mysql.jdbc.Driver");
					// connec to db
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1localhost:portnum/schemaName", "username",
							"password");
					// write a sql query
					String sql = "Select * from employees";
					PreparedStatement ps = con.prepareStatement(sql);
					// execute query
					ResultSet rs = ps.executeQuery();
					// iterate
					while (rs.next()) {
						int empId = rs.getInt("id");
						String empName = rs.getString("name");
					}

				} catch (Throwable e) {
					e.printStackTrace();
				} finally {
					try {
						// close db connection
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}

		7.Code for singleton class:
		-------------------------------


		public class Employee {
			private static Employee emp = null;

			private Employee() {
			}

			public static Employee getObject() {
				if (emp == null) {
					emp = new Employee();
				}
				return emp;

			}

			public void getId() {
				System.out.println("12");
			}

			public void getName() {
				System.out.println("Vel");
			}
		}



		public class Details {
			public static void main(String[] args) {
				Employee e = Employee.getObject();
				e.getId();
				e.getName();

			}

		}


		8.userdefine exception:
		-------------------------

		public class MyException extends Exception {
			@Override
			public String getMessage() {
				return "Not Found";
			}

		}



		public class Details {
			public static void main(String[] args) {
				String env = "down";
				if (env.equals("down")) {
					try {
						throw new MyException();
					} catch (MyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}



		SELENIUM:
		----------
		1.Windows Handling:
		----------------------

		import java.util.Set;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// parent window id
				String pWid = driver.getWindowHandle();
				// all windows
				Set<String> allWindows = driver.getWindowHandles();
				for (String x : allWindows) {
					if (!pWid.equals(x)) {
						driver.switchTo().window(x);
					}

				}

			}
		}


		2.Webtable:
		---------------
		package org.cts.toyota.login;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// Enhnaced for loop
				List<WebElement> tRows = driver.findElements(By.tagName("tr"));
				for (WebElement rows : tRows) {
					List<WebElement> tData = rows.findElements(By.tagName("td"));
					for (WebElement data : tData) {
						System.out.println(data.getText());

					}
				}

				// for loop
				for (int i = 0; i < tRows.size(); i++) {
					List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
					for (int j = 0; j < tData.size(); j++) {
						System.out.println(tData.get(j).getText());
					}
				}
			}
		}


		3.Screenshot:
		---------------

		import java.io.File;
		import java.io.IOException;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");

				TakesScreenshot tk = (TakesScreenshot) driver;
				File f = tk.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f, new File("dest location"));

			}
		}

		4.Scroll down/scroll up:
		-------------------------
		package org.cts.toyota.login;

		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");

				WebElement down = driver.findElement(By.id("email"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				// down
				js.executeScript("arguments[0].scrollIntoView(true)", down);
				// up
				js.executeScript("arguments[0].scrollIntoView(false)", down);

			}
		}

		5.links Details:
		-----------------
		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				int linksCount = allLinks.size();
				System.out.println(linksCount);
			}
		}

		print all links in webpage:
		----------------------------
		package org.test;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				List<WebElement> allLinksElement = driver.findElements(By.tagName("a"));
				for (int i = 0; i < allLinksElement.size(); i++) {
					String links = allLinksElement.get(i).getAttribute("href");
					System.out.println(links);

				}

				driver.quit();
			}
		}


		6.Broken links:
		--------------
		print Brocken links:
		------------------------
		package org.test;

		import java.net.HttpURLConnection;
		import java.net.URL;
		import java.net.URLConnection;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				List<WebElement> allLinksElement = driver.findElements(By.tagName("a"));
				for (int i = 0; i < allLinksElement.size(); i++) {
					String links = allLinksElement.get(i).getAttribute("href");
					try {
						URL u = new URL(links);
						URLConnection uc = u.openConnection();
						HttpURLConnection h = (HttpURLConnection) uc;
						int code = h.getResponseCode();
						System.out.println(code);
						if (code >= 400) {
							System.out.println(links);

						}

						// rsp 200-s,400-failed
					} catch (Throwable e) {
						System.out.println(links);
					}

				}

				driver.quit();
			}
		}


		print Brocken links count:
		--------------------------
		package org.test;

		import java.net.HttpURLConnection;
		import java.net.URL;
		import java.net.URLConnection;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				List<WebElement> allLinksElement = driver.findElements(By.tagName("a"));
				int count = 0;
				for (int i = 0; i < allLinksElement.size(); i++) {
					String links = allLinksElement.get(i).getAttribute("href");
					try {
						URL u = new URL(links);
						URLConnection uc = u.openConnection();
						HttpURLConnection h = (HttpURLConnection) uc;
						int code = h.getResponseCode();
						System.out.println(code);
						if (code >= 400) {
							count++;

						}

						// rsp 200-s,400-failed
					} catch (Throwable e) {
					}

				}
				System.out.println(count);

				driver.quit();
			}
		}






		7.Drop Down-print the selected values,select all values using index,values,text:
		-----------------------------------------------------------------------------------

		print all selected values:
		-----------------------------

		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				WebElement w = driver.findElement(By.id("country"));
				Select s = new Select(w);
				// foreach
				List<WebElement> emp = s.getAllSelectedOptions();
				for (WebElement x : emp) {
					System.out.println(x.getText());

				}
				// for loop
				for (int i = 0; i < emp.size(); i++) {
					System.out.println(emp.get(i).getAttribute("value"));

				}

			}
		}

		select All values:
		-------------------
		package org.cts.toyota.login;

		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				WebElement w = driver.findElement(By.id("country"));
				Select s = new Select(w);
				// select all values by index
				List<WebElement> optionsAll = s.getOptions();
				for (int i = 0; i < optionsAll.size(); i++) {
					s.selectByIndex(i);

				}
				// select all values by value with for loop
				for (int i = 0; i < optionsAll.size(); i++) {
					s.selectByValue(optionsAll.get(i).getAttribute("value"));

				}
				// select all values by value with foreach
				for (WebElement x : optionsAll) {
					s.selectByValue(x.getAttribute("value"));

				}
				// select values by visibletext with for loop
				for (int i = 0; i < optionsAll.size(); i++) {
					s.selectByVisibleText(optionsAll.get(i).getText());

				}

				// select all values by visible text with foreach
				for (WebElement x : optionsAll) {
					s.selectByVisibleText(x.getText());
				}

			}
		}


		8.Actions(drag and drop,double click,right click,mouseover action):
		-------------------------------------------------------------------
		Drag and drop:
		-------------
		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// drag and drop
				WebElement from = driver.findElement(By.id("from"));
				WebElement dest = driver.findElement(By.id("to"));
				Actions acc = new Actions(driver);
				acc.dragAndDrop(from, dest).perform();
			}
		}

		right click:
		--------------
		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// drag and drop
				WebElement from = driver.findElement(By.id("from"));
				Actions acc = new Actions(driver);
				acc.contextClick(from).perform();
			}
		}

		Double click:
		---------------

		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// drag and drop
				WebElement from = driver.findElement(By.id("from"));
				Actions acc = new Actions(driver);
				acc.doubleClick(from).perform();
			}
		}

		Mouseover actions:
		-------------------
		package org.cts.toyota.login;

		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// drag and drop
				WebElement from = driver.findElement(By.id("from"));
				Actions acc = new Actions(driver);
				acc.moveToElement(from).perform();
			}
		}


		9.wait(fluent waits,explicit,implicit):
		--------------------------------------------------
		Implict wait:
		-----------------


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			}

		}
		explicit wait:
		------------------

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				WebElement txtUserName = driver.findElement(By.id("email"));
				WebDriverWait w = new WebDriverWait(driver, 10);
				WebElement loc = w.until(ExpectedConditions.elementToBeClickable(txtUserName));
				loc.click();

			}

		}

		Fluent wait:
		---------------

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.FluentWait;
		import org.openqa.selenium.support.ui.Wait;

		public class Sample {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				WebElement txtUserName = driver.findElement(By.id("email"));

				Wait w = new FluentWait(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
						.ignoring(Throwable.class);
				WebElement w1 = (WebElement) w.until(ExpectedConditions.elementToBeClickable(txtUserName));
				w1.click();

			}

		}

		10.Locators(xpath functions,css selectors):
		-----------------------------------------------
		contains:
		----------
		text:
		----------
		//tagName[contains(text(),'partially textname')]
		webElement:
		-------------
		//tagName[contains(@attributename,'partially attributevalue')]



		11.alerts,frames,frames count-switch:
		-------------------------------------------
		Alert switch:
		---------------
		import java.io.IOException;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				// alert switch
				Alert al = driver.switchTo().alert();
				// ok
				al.accept();
				// cancell
				al.dismiss();
				// insert
				al.sendKeys("yes");

			}
		}

		frame switch:
		----------------
		package org.cts.toyota.login;

		import java.io.IOException;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				driver.switchTo().frame("id");

			}
		}

		frames count:
		--------------

		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Employee {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver", "path");
				WebDriver driver = new ChromeDriver();
				driver.get("url");
				List<WebElement> emp = driver.findElements(By.tagName("iframe"));
				int frameCount = emp.size();
				System.out.println(frameCount);
			}
		}

		12.Resuable methods for specif functions(like sendkeys,button,etc..):
		--------------------------------------------------------------------------
		senkeys:
		----------
		package org.cts.toyota.login;

		import org.openqa.selenium.WebElement;

		public class Base {
			public void type(WebElement element, String name) {
				element.sendKeys(name);
			}

		}

		click:
		--------
		package org.cts.toyota.login;

		import org.openqa.selenium.WebElement;

		public class Base {
			public void btnClick(WebElement element) {
				element.click();
			}

		}




		FRAMEWORKS:
		------------
		1.Read/write/update values from excel,csv file,xml,json,txt file:
		----------------------------------------------------------------------
		excel(read):
		----------
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class Employee {
			public static void main(String[] args) throws IOException {
				File f = new File("");
				FileInputStream stream = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(stream);
				Sheet s = w.getSheet("sheetName");
				for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
					Row r = s.getRow(i);
					for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
						Cell c = r.getCell(j);
						int type = c.getCellType();
						if (type == 1) {
							String name = c.getStringCellValue();
							System.out.println(name);
						}
						if (type == 0) {
							double d = c.getNumericCellValue();
							long l = (long) d;
							String name = String.valueOf(l);
						}
					}

				}

			}

		}

		excel(update):
		-------------

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class Employee {
			public static void main(String[] args) throws IOException {
				File f = new File("location");
				FileInputStream stream = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(stream);
				Sheet s = w.getSheet("sheetName");
				Row r = s.getRow(2);
				Cell c = r.getCell(1);
				// java---selenium
				String name = c.getStringCellValue();
				if (name.equals("java")) {
					c.setCellValue("selenium");
				}
				FileOutputStream o = new FileOutputStream(f);
				w.write(o);

			}

		}

		excel(write):
		---------------
		package org.test.DataDrivenClass;

		import java.io.File;
		import java.io.FileOutputStream;
		import java.io.IOException;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class Employee {
			public static void main(String[] args) throws IOException {
				File f = new File("location");
				Workbook w = new XSSFWorkbook();
				Sheet s = w.createSheet("sheetname");
				Row r = s.createRow(2);
				Cell c = r.createCell(0);
				c.setCellValue("Hello");

				FileOutputStream o = new FileOutputStream(f);
				w.write(o);

			}

		}


		2.Junit/TestNG annotations and order:
		-----------------------------------------
		Junit Annotations:
		-----------------------
		@RunWith
		@Suite.classess
		@Ignore
		@BeforeClass
		@After
		@Test
		@Before
		@AfterClass

		@RunWith & @Suite.SuiteClassess:
		-------------------------------------
		import org.junit.runner.RunWith;
		import org.junit.runners.Suite;

		@RunWith(Suite.class)
		@Suite.SuiteClasses({ Employee.class, Hello.class })
		public class MainClass {

		}

		TestNG annotations:
		-------------------
		@Test
		@BeforeSuite
		@AfterSuite
		@BeforeClass
		@AfterClass
		@BeforeMethod
		@AfterMethod
		@BeforeTest
		@AfterTest
		@BeforeGroup
		@AfterGroup

		3.Data provider,parallel browser execution,Rerun failed testcases automatically ,pass values from testng.xml,groups:
		---------------------------------------------------------------------------------------------------
		Dataprovider with iterate:
		-----------------------------
		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;

		public class Employee {
			@DataProvider(name = "res")
			public Object[][] data() {
				return new Object[][] { { "JAVA", "java@123" }, { "SQL", "Selenium@1234" }, { "PLSQL", "PLSQL@123" } };

			}

			@Test(dataProvider = "res")
			public void login(String s[]) {
				for (String x : s) {
					System.out.println(x);
				}

			}

		}

		DataProvider with variables:
		---------------------------------

		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;

		public class Employee {
			@DataProvider(name = "res")
			public Object[][] data() {
				return new Object[][] { { "JAVA", "java@123" }, { "SQL", "Selenium@1234" }, { "PLSQL", "PLSQL@123" } };

			}

			@Test(dataProvider = "res")
			public void login(String s1, String s2) {
				System.out.println(s1);
				System.out.println(s2);

			}

		}

		DataProvider with different class:
		----------------------------------


		import org.testng.annotations.Test;

		public class Hello {
			@Test(dataProvider = "res", dataProviderClass = Employee.class)
			public void login(String s1, String s2) {
				System.out.println(s1);
				System.out.println(s2);

			}

		}

		import org.testng.annotations.DataProvider;

		public class Employee {
			@DataProvider(name = "res")
			public Object[][] data() {
				return new Object[][] { { "JAVA", "java@123" }, { "SQL", "Selenium@1234" }, { "PLSQL", "PLSQL@123" } };

			}

		}
		pass value from testng.xml:
		-------------------------------
		package org.test.FacebookProject;

		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;

		public class Employee {
			@Test
			@Parameters({ "userName", "password" })
			public void login(String s1, String s2) {
				System.out.println(s1);
				System.out.println(s2);

			}

		}



		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="Suite">
			<test name="Test">
				<parameter name="userName" value="JAVA"></parameter>
				<parameter name="password" value="Selenium"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />

				</classes>
			</test> <!-- Test -->
		</suite> <!-- Suite -->


		Cross browser execution:
		------------------------
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="Suite">
			<test name="ieTest">
				<parameter name="browser" value="ie"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->

			<test name="ffTest">
				<parameter name="browser" value="ff"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->

			<test name="chromeTest">
				<parameter name="browser" value="chrome"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->
		</suite> <!-- Suite -->


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;

		public class Employee {
			@Test
			@Parameters({ "browser" })
			public void login(String browserName) {
				WebDriver driver = null;
				if (browserName.equals("ie")) {
					System.setProperty("webdriver.ie.driver", "path");
					driver = new InternetExplorerDriver();

				} else if (browserName.equals("ff")) {
					System.setProperty("webdriver.gecko.driver", "path");
					driver = new FirefoxDriver();

				} else if (browserName.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "path");
					driver = new ChromeDriver();

				} else {
					System.out.println("Nothing found");
				}
				driver.get("url");

			}

		}


		Parallel Browser execution:
		-------------------------------
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="Suite" parallel="tests">
			<test name="ieTest">
				<parameter name="browser" value="ie"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->

			<test name="ffTest">
				<parameter name="browser" value="ff"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->

			<test name="chromeTest">
				<parameter name="browser" value="chrome"></parameter>
				<classes>
					<class name="org.test.FacebookProject.Employee" />
				</classes>
			</test> <!-- Test -->
		</suite> <!-- Suite -->



		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;

		public class Employee {
			@Test
			@Parameters({ "browser" })
			public void login(String browserName) {
				WebDriver driver = null;
				if (browserName.equals("ie")) {
					System.setProperty("webdriver.ie.driver", "path");
					driver = new InternetExplorerDriver();

				} else if (browserName.equals("ff")) {
					System.setProperty("webdriver.gecko.driver", "path");
					driver = new FirefoxDriver();

				} else if (browserName.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "path");
					driver = new ChromeDriver();

				} else {
					System.out.println("Nothing found");
				}
				driver.get("url");

			}

		}

		skip the multiple test:
		---------------------------
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="Suite" parallel="tests">
			<test name="ieTest">
				<classes>
					<class name="org.test.FacebookProject.Employee">
						<methods>
							<include name="register"></include>
						</methods>
					</class>
				</classes>
			</test> <!-- Test -->
		</suite> <!-- Suite -->


		import org.testng.annotations.Test;

		public class Employee {
			@Test
			public void login() {
				// TODO Auto-generated method stub

			}

			@Test
			public void register() {
				// TODO Auto-generated method stub

			}

			@Test
			public void payment() {
				// TODO Auto-generated method stub

			}

			@Test
			public void contacts() {
				// TODO Auto-generated method stub

			}

			@Test
			public void phone() {
				// TODO Auto-generated method stub

			}

		}



		ReRun failed test(particular test):
		----------------------------------------

		import org.testng.IRetryAnalyzer;
		import org.testng.ITestResult;

		public class Failed implements IRetryAnalyzer {
			int min = 0, max = 10;

			public boolean retry(ITestResult arg0) {
				if (min <= max) {
					min++;
					return true;
				}
				return false;
			}

		}



		import org.testng.annotations.Test;

		public class Employee {
			@Test(retryAnalyzer = Failed.class)
			public void login() {
				// TODO Auto-generated method stub

			}

			@Test
			public void register() {
				// TODO Auto-generated method stub

			}

			@Test
			public void payment() {
				// TODO Auto-generated method stub

			}

			@Test
			public void contacts() {
				// TODO Auto-generated method stub

			}

			@Test
			public void phone() {
				// TODO Auto-generated method stub

			}

		}





		ReRun failed test(all test):
		----------------------------

		import org.testng.IRetryAnalyzer;
		import org.testng.ITestResult;

		public class Failed implements IRetryAnalyzer {
			int min = 0, max = 10;

			public boolean retry(ITestResult arg0) {
				if (min <= max) {
					min++;
					return true;
				}
				return false;
			}

		}



		import org.testng.annotations.Test;

		public class Employee {
			@Test
			public void login() {
				// TODO Auto-generated method stub

			}

			@Test
			public void register() {
				// TODO Auto-generated method stub

			}

			@Test
			public void payment() {
				// TODO Auto-generated method stub

			}

			@Test
			public void contacts() {
				// TODO Auto-generated method stub

			}

			@Test
			public void phone() {
				// TODO Auto-generated method stub

			}

		}



		import java.lang.reflect.Constructor;
		import java.lang.reflect.Method;

		import org.testng.IAnnotationTransformer;
		import org.testng.annotations.ITestAnnotation;

		public class FailedAll implements IAnnotationTransformer {

			public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
				arg0.setRetryAnalyzer(Failed.class);
			}

		}


		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="Suite">
			<listeners>
				<listener class-name="org.test.FacebookProject.FailedAll"></listener>
			</listeners>
			<test name="ieTest">
				<classes>
					<class name="org.test.FacebookProject.Employee">
					</class>
				</classes>
			</test> <!-- Test -->
		</suite> <!-- Suite -->


		4.Cucumber-feature,step def,test runner class
		5.GIT-Commands
		6.MAVEN-Commands


































	
	
	
	
	
}
