package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportIssuePage extends PageBase {
    //Mapping
    By categoryComboBox = By.name("category_id");

    //Actions
    public void selecionarCategoria(String categoria) {
        comboBoxSelectByVisibleText(categoryComboBox, categoria);
    }
}
