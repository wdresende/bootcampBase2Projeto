package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportIssuePage extends PageBase {
    //Mapping
    By categoryComboBox = By.name("category_id");
    By reproducibilityComboBox = By.name("reproducibility");
    By severityComboBox = By.name("severity");
    By priorityComboBox = By.name("priority");
    By selectProfileComboBox = By.name("profile_id");
    By assignToComboBox = By.name("handler_id");
    By summaryField = By.name("summary");
    By descriptionTextArea = By.name("description");
    By escolherArquivoButton = By.id("ufile[]");

    //Actions
    public void selecionarCategoria(String categoria) {
        comboBoxSelectByVisibleText(categoryComboBox, categoria);
    }

    public void selecionarReprodutibilidade(String reprodutibilidade) {
        comboBoxSelectByVisibleText(reproducibilityComboBox, reprodutibilidade);
    }

    public void selecionarGravidade(String gravidade) {
        comboBoxSelectByVisibleText(severityComboBox, gravidade);
    }
}
