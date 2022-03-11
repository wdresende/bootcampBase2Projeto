package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MyViewPage myViewPage;

    //Tests
    @Test
    public void efetuarLoginValido(){

        //Objects instances
        loginPage = new LoginPage();
        myViewPage = new MyViewPage();

        //Parameteres
        String usuario = GlobalParameters.USUARIO_LOGIN;
        String senha = GlobalParameters.SENHA_LOGIN;
        String mensagemInformacaoEsperada = "Logged in as: " + usuario;

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        System.out.println(myViewPage.retornaMensagemLogado());

        Assert.assertTrue(myViewPage.retornaMensagemLogado().contains(mensagemInformacaoEsperada));
    }
}
