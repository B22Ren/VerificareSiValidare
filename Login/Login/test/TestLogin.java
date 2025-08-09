import java.nio.file.Path;

import java.util.List;
import org.junit.After;
import org.junit.Assert; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {
//initializati aceasta variabila cu calea corecta catre driver-ul Geckodriver
String driverPath="C:\\Users\\Renata\\Desktop\\gecko\\geckodriver.exe";
public WebDriver driver;
@Before
public void setUp() {
FirefoxOptions options = new FirefoxOptions();
options.setBinary(getFirefoxLocation());
System.setProperty("webdriver.gecko.driver", driverPath);
driver = new FirefoxDriver(options);
driver.manage().window().maximize();
}
//metoda folosita pentru a determina calea de instalare a browser-ului Firefox
public static Path getFirefoxLocation() {
FirefoxOptions options = new FirefoxOptions();
options.setBrowserVersion("stable");
SeleniumManagerOutput.Result output =
DriverFinder.getPath(GeckoDriverService.createDefaultService(), options);
return Path.of(output.getBrowserPath());
}
@After
public void tearDown() {
driver.quit();
}

@Test
public void loginWrongUsername() {
driver.get("https://practicetestautomation.com/practice-test-login/");
WebElement username=driver.findElement(By.id("username"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.id("submit"));
username.sendKeys("studenti");
password.sendKeys("Password123");
login.click();
String expectedUrl="https://practicetestautomation.com/practice-test-login/";
String actualUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
WebElement messageEl=driver.findElement(By.id("error"));
Assert.assertNotNull(messageEl);
System.out.println("Elementul error exista");
String errorMessage = messageEl.getText();
System.out.println("Mesajul de eroare: "+errorMessage);
String expectedLoginMessage="Your username is invalid!";
Assert.assertEquals(expectedLoginMessage,errorMessage);
}
@Test
public void verificaTitluPagina() {
driver.get("https://practicetestautomation.com/practice-test-login/");
String exptectedTitle="Test Login | Practice Test Automation";
String actualTitle=driver.getTitle();
Assert.assertEquals(exptectedTitle,actualTitle);
}
@Test
public void verificaButoaneCheck() {
driver.get("https://demo.guru99.com/test/radio.html");
WebElement option1= driver.findElement(By.id("vfb-6-0"));
//selectam primul checkbox
option1.click();
Assert.assertTrue(option1.isSelected());
if (option1.isSelected())
System.out.println("Test1: Checkbox1 e selectata");
else
System.out.println("Test1: Checkbox1 nu e selectata");
//deselectam primul checkbox
option1.click();
Assert.assertFalse(option1.isSelected());
if (!option1.isSelected())
System.out.println("Test2: Checkbox1 NU e selectata");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username1")));

WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
radio1.click();
Assert.assertTrue(radio1.isSelected());
System.out.println("Test 3: Radio Button 1 este selectat");
WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
radio2.click();
Assert.assertTrue(radio2.isSelected());
Assert.assertFalse(radio1.isSelected());
System.out.println("Test 4: Radio Button 2 este selectat si Radio 1 NU este selectat");
}
@Test
public void verificaLinkuri() {
driver.get("https://practicetestautomation.com/practice-test-login/");
List<WebElement> links= driver.findElements(By.tagName("a"));
int i= links.size();
System.out.println(i);
for(int j=0; j<i; j++) {
System.out.println(links.get(j).getText());
System.out.println(links.get(j).isDisplayed());
}
Assert.assertEquals(9,i);
}
@Test
public void login() {
//se deschide pagina web
driver.get("https://practicetestautomation.com/practice-test-login/");
// in continuare, se cauta elementele pe pagina  campurile de text username si password
// identificatorii acestora se pot determina analizand sursa HTML a paginii web
// click dreapta -> View Page Source
WebElement username=driver.findElement(By.id("username"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.id("submit"));
// se completeaza campurile de text cu credentialele de test si se face click pe
// butonul Submit
username.sendKeys("student");
password.sendKeys("Password123");
login.click();
// in continuare, testam daca noua pagina web este cea corespunzatoare unui
// login reusit
//verificam noua pagina web
String expectedUrl="https://practicetestautomation.com/logged-in-successfully/";
String actualUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
//verificam mesajul afisat in cazul unei autentificari reusite

String loginMessage = driver.findElement(By.className("has-text-align-center")).getText();
String expectedLoginMessage="Congratulations student. You successfully logged in!";
Assert.assertEquals(expectedLoginMessage,loginMessage);
//verifica existenta link-ului Log out (element tip <a>)
WebElement logoutLink = driver.findElement(By.linkText("Log out"));
Assert.assertNotNull(logoutLink);

} }