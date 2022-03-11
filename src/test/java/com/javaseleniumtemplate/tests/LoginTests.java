package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = GlobalParameters.USUARIO_LOGIN;
        String senha = GlobalParameters.SENHA_LOGIN;
//        String mensagemErroEsperada = "E-mail ou senha inv";

        //Test
//        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

//        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
}
