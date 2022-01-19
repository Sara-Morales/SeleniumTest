/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author sala304
 */
public class ConfirmarForm{
    WebDriver driver;
    By Verif = By.cssSelector("body > div.freebirdFormviewerViewFormContentWrapper > div:nth-child(2) > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewResponseConfirmationMessage");
    
   
    
    
    public ConfirmarForm (WebDriver driver){

        this.driver = driver;

    }


    
    public String getVerif(){

        return driver.findElement(Verif).getText();

    }
    
    
    
    
    public void loginApplication(){

        this.getVerif(); 
        
    }

    
}