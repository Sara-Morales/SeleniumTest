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
public class Fomulario {
    WebDriver driver;
    By Nombre = By.cssSelector("#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewItemList > div:nth-child(1) > div > div > div.freebirdFormviewerComponentsQuestionTextRoot > div > div.quantumWizTextinputPaperinputMainContent.exportContent > div > div.quantumWizTextinputPaperinputInputArea > input");
    By Ciudad = By.cssSelector("#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewItemList > div:nth-child(2) > div > div > div.freebirdFormviewerComponentsQuestionTextRoot > div > div.quantumWizTextinputPaperinputMainContent.exportContent > div > div.quantumWizTextinputPaperinputInputArea > input");
    By QuererGrande = By.cssSelector("#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewItemList > div:nth-child(3) > div > div > div.freebirdFormviewerComponentsQuestionTextRoot > div > div.quantumWizTextinputPaperinputMainContent.exportContent > div > div.quantumWizTextinputPaperinputInputArea > input");
    By StudioFuturo = By.cssSelector("#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewItemList > div:nth-child(4) > div > div > div.freebirdFormviewerComponentsQuestionTextRoot > div > div.quantumWizTextinputPaperinputMainContent.exportContent > div > div.quantumWizTextinputPaperinputInputArea > input");
    By BtnConfirmarForm = By.cssSelector("#mG61Hd > div.freebirdFormviewerViewFormCard.exportFormCard > div > div.freebirdFormviewerViewNavigationNavControls > div.freebirdFormviewerViewNavigationButtonsAndProgress.hasClearButton > div.freebirdFormviewerViewNavigationLeftButtons > div > span > span");
   
    
    
    public Fomulario(WebDriver driver){

        this.driver = driver;

    }
    
    public void setName(String strName){

        driver.findElement(Nombre).sendKeys(strName);

    }
    
    public void setCity(String strCity){

         driver.findElement(Ciudad).sendKeys(strCity);

    }
    
       public void setBigger(String strBigger){

         driver.findElement(QuererGrande).sendKeys(strBigger);

    }
       
       public void setStuddy(String strStuddy){

         driver.findElement(StudioFuturo).sendKeys(strStuddy);

    }

    public void clickEnv(){
        
        
        driver.findElement(BtnConfirmarForm).click();

    }    
    
 
    
    //Metodo para comunicarnos con los demas, paso por paso
    public void LlenarFormulario(String Name, String City, String Bigger, String Studdy){

        this.setName(Name);                // Paso 1
        this.setCity(City);                // Paso 2
        this.setBigger(Bigger);            // Paso 3
        this.setStuddy(Studdy);            // Paso 4
        this.clickEnv();                   // Paso 5
    }

    
}