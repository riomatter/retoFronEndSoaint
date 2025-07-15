Feature: Validar usuario bloqueado

  Scenario: Usuario no puede loguearse a la web porque esta bloqueado
    Given Que el usuario navega hacia la pagina de Sauce Demo para validar el usuario bloqueado
    When Inicia sesion con credenciales de usuario bloqueado
    Then Deberia visualizar el mensaje de validacion de usuario bloqueado