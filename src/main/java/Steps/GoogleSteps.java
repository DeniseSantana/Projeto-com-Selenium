package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

	private GooglePage googlePage;

	public GoogleSteps() {

		googlePage = new GooglePage();
	}

	@Given("que esteja na pagina do google")
	public void que_esteja_na_pagina_do_google() {
		googlePage.caminhosite();
	}

	@When("escrevo no campo de pesquisa")
	public void escrevo_no_campo_de_pesquisa() {
		googlePage.inserindopesquisa();
	}

	@Then("sou redirecionado para a pesquisa feita")
	public void sou_redirecionado_para_a_pesquisa_feita() {
		googlePage.validandotela();
	}

}
