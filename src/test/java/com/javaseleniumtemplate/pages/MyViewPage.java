package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyViewPage extends PageBase {
    //Mapping
    By informacaoLogadoLabel = By.className("login-info-left");
    By reportIssueLink = By.cssSelector("a[href='/bug_report_page.php']");

    //Actions
    public String retornaMensagemLogado() {
        return getText(informacaoLogadoLabel);
    }

    public void clicarEmReportIssue() {
        click(reportIssueLink);
    }
}
