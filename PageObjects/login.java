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
public class login {
    WebDriver driver;
    By userName = By.name("identifier");
    By password = By.name("password");
    By signIn = By.cssSelector("#identifierNext > div > button > span");
    By btnInicioSesion = By.cssSelector("#passwordNext > div > button > span");
    
 
   
    
    
    public login(WebDriver driver){

        this.driver = driver;

    }
    
    public void setUserName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }
    
    public void setPassword(String strPassword){

         driver.findElement(password).sendKeys(strPassword);

    }
    //pasa primer pantalla
    public void clickLogin(){
        
        
        driver.findElement(signIn).click();

    }    
    //Click para ingresar totalmente al form
     public void cconfirmarLogin(){
        
        
        driver.findElement(btnInicioSesion).click();

    }    
    public void loginApplication(String userName, String password){
        
        this.setUserName(userName); // Paso 1
        this.clickLogin();         // paso 2
        this.setPassword(password); // paso 3
        this.cconfirmarLogin();//paso 4
        
    }
    
    
    
}
