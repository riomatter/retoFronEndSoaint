package selenium.FlujoUsuarioBloqueadoUnhappyPath;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.Hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CP01ValidarUsuarioBloqueadoUnhappyPath {

    WebDriver driver = Hooks.driver;

    @Given("Que el usuario navega hacia la pagina de Sauce Demo para validar el usuario bloqueado")
    public void Que_el_usuario_navega_hacia_la_pagina_de_Sauce_Demo_para_validar_el_usuario_bloqueado() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("Inicia sesion con credenciales de usuario bloqueado")
    public void Inicia_sesion_con_credenciales_de_usuario_bloqueado() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }


    @Then("Deberia visualizar el mensaje de validacion de usuario bloqueado")
    public void Deberia_visualizar_el_mensaje_de_validacion_de_usuario_bloqueado() throws InterruptedException {
        Thread.sleep(1000);
        String mensajeBloqueo = "Epic sadface: Sorry, this user has been locked out.";
        String mensajeActual = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        assertEquals("El mensaje de confirmacion no coincide", mensajeBloqueo, mensajeActual);
    }
}