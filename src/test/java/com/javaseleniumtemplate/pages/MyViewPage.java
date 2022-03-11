package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyViewPage extends PageBase {
    //Mapping
    By informacaoLogadoLabel = By.className("login-info-left");

    //Actions
    public String retornaMensagemLogado(){
        return getText(informacaoLogadoLabel);
    }
}
