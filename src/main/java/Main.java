import com.github.igorsuhorukov.phantomjs.PhantomJsDowloader;

import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.igorsuhorukov.phantomjs.PhantomJsDowloader;
import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    public static void main(String[] args) {

//        try {
//            Document doc = Jsoup.connect("https://stepik.org/catalog")
//                    .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")
//                    .get();
//            String html = doc.outerHtml();
//            System.out.println(html);
//
//        } catch (IOException e) {
//        }

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stepik.org/catalog");
        List<WebElement> elements = driver.findElement(By.className("course-pack")).findElements(By.tagName("li"));
        for (WebElement element : elements) {
            String href = element.getAttribute("id");
            System.out.println(href);
        }
//        String href = elements.getAttribute("href");
//        System.out.println(href);
    }
}
