package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("input[value='Login']");
//    By cookieButton = By.xpath("//*[@aria-label='dismiss cookie message']");
//    By errorMessageLabel = By.className("login-error");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

//    public void clicarEmAceitarCookies(){
//        click(cookieButton);
//    }

//    public String retornaMensagemErroLogin(){
//        return getText(errorMessageLabel);
//    }
}
