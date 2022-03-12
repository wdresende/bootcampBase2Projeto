package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginSelectProjectPage extends PageBase {
    //Mapping
    By chooseProjectComboBox = By.cssSelector("td > select");
    By selectProjectButton = By.cssSelector("input[value='Select Project']");

    //Actions
    public void selecionarProjeto(String projeto) {
        comboBoxSelectByVisibleText(chooseProjectComboBox, projeto);
    }

    public void clicarBotaoselecionarProjeto() {
        click(selectProjectButton);
    }
}
