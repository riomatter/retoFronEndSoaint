package selenium.FlujoCompraHappyPath;

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

public class CP01ValidarFlujoCompraHappyPath {

    WebDriver driver = Hooks.driver;

    @Given("Que el usuario navega hacia la pagina de Sauce Demo")
    public void Que_el_usuario_navega_hacia_la_pagina_de_Sauce_Demo() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("Inicia sesion con credenciales validas")
    public void Inicia_sesion_con_credenciales_validas() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @And("Agrega un producto al carrito de compras")
    public void Agrega_un_producto_al_carrito_de_compras() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    @And("Completa el proceso de compra")
    public void Completa_el_proceso_de_compra()  {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='shopping-cart-link']"))).click();
        driver.findElement(By.id("checkout")).click();

        //Aqui procede el checkout
        driver.findElement(By.id("first-name")).sendKeys("Mario");
        driver.findElement(By.id("last-name")).sendKeys("Martin Anciburo");
        driver.findElement(By.id("postal-code")).sendKeys("15001");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }

    @Then("Deberia visualizar la pagina de confirmacion de compra")
    public void Deberia_visualizar_la_pagina_de_confirmacion_de_compra() throws InterruptedException {
        Thread.sleep(1000);
        String mensajeAgradecimiento = "Thank you for your order!";
        String mensajeActual = driver.findElement(By.cssSelector("[data-test='complete-header']")).getText();
        assertEquals("El mensaje de confirmacion no coincide",mensajeAgradecimiento,mensajeActual);
    }
}
