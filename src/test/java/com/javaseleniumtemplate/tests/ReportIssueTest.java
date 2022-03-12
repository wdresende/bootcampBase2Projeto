package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginSelectProjectPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ReportIssuePage;
import org.junit.Test;

public class ReportIssueTest extends TestBase {
    MyViewPage myViewPage;
    ReportIssuePage reportIssuePage;
    LoginFlows loginFlows;
    LoginSelectProjectPage loginSelectProjectPage;

    @Test
    public void reportarIssueSucesso() {

        myViewPage = new MyViewPage();
        reportIssuePage = new ReportIssuePage();
        loginSelectProjectPage = new LoginSelectProjectPage();
        loginFlows = new LoginFlows();

        String projeto = "TesteTati";
        String categoria = "[All Projects] Teste";

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_LOGIN, GlobalParameters.SENHA_LOGIN);
        myViewPage.clicarEmReportIssue();
        loginSelectProjectPage.selecionarProjeto(projeto);
        loginSelectProjectPage.clicarBotaoselecionarProjeto();
        reportIssuePage.selecionarCategoria(categoria);
    }
}
