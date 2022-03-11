package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Test;

public class ReportIssueTest extends TestBase {
    MyViewPage myViewPage;
    LoginFlows loginFlows;

    @Test
    public void reportarIssueSucesso() {

        myViewPage = new MyViewPage();
        loginFlows = new LoginFlows();

        loginFlows.efetuarLogin(GlobalParameters.USUARIO_LOGIN, GlobalParameters.SENHA_LOGIN);
        myViewPage.clicarEmReportIssue();
    }
}
