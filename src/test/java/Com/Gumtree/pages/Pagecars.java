package Com.Gumtree.pages;

import Com.Gumtree.Driverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.List;


public class Pagecars extends Driverfactory {
    public String currentURL() {

        return driver.getCurrentUrl();
    }

    @FindBy(name = "q")
    WebElement googlesearch;

    public void carsinLondon(String item) throws InterruptedException {
        googlesearch.sendKeys(item);
        Thread.sleep(3000);
    }

    public void printsearchlinks() throws IOException {

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("No of Google links found:" + allLinks.size());
        for (WebElement link : allLinks) {
            String google = link.getAttribute("href");
            System.out.println(google);
        }
    }

    public void gumTreeLinks(){
        List<WebElement>gumtreeLinks=driver.findElements(By.partialLinkText("gumtree"));
        System.out.println("No of Gumtree links found:" +gumtreeLinks.size());
        if (gumtreeLinks.size()>0){
            System.out.println("Gumtree Links Found are greater then Zero");
        }
         String[]linkTexts=new String[gumtreeLinks.size()];
           int A=0;
        for(WebElement link:gumtreeLinks) {
            linkTexts[A] = link.getText();
            A++;
        }
            String notworkingURLTitle="Not Working Title";
            for(String t :linkTexts){
                driver.findElement(By.linkText(t)).click();
                if(driver.getTitle().equals(notworkingURLTitle)){
                    System.out.println(t+ "is not working");
                }
                else {
                    System.out.println(t +" is  working.");
                }
                driver.navigate().back();
            }
        }
    }







