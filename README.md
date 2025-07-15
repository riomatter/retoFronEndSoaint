# retoFronEndSoaint
Reto de automatizacion FrontEnd

# Automatización de pruebas con Selenium + Cucumber + TestNG

Este proyecto está desarrollado en Java utilizando **Selenium WebDriver**, **Cucumber**, **TestNG**, y gestionado con **Maven**.

## Tecnologías usadas

- Java 20
- Maven
- Selenium WebDriver `4.23.1`
- WebDriverManager `5.9.2`
- Cucumber `7.18.1`
- TestNG `7.8.0`

---

## Cómo ejecutar los tests en IntelliJ IDEA

1. **Clona el repositorio:**

```bash
git clone https://github.com/riomatter/retoFrontEndSoaint.git
```

2. **Importa el proyecto como un proyecto Maven en IntelliJ IDEA.**

3. **Instala las dependencias automáticamente:**  
   Maven descargará las dependencias desde el archivo `pom.xml`.

4. **Ubica tu clase runner de pruebas**  
   Por ejemplo: `src/test/java/selenium/RunnerTest.java` o `TestRunner.java`.

5. **Haz clic derecho** sobre la clase runner y selecciona `Run 'RunnerTest'`.

---

## ▶Ejecución desde terminal

Asegúrate de tener Maven instalado y en tu `PATH`.

```bash
mvn clean test
```

Esto ejecutará todos los escenarios definidos en los archivos `.feature`.

---

Mario Martin Anciburo
