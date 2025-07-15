Feature: Validar el flujo de compra

    Scenario: Usuario completa exitosamente el flujo de compra
        Given Que el usuario navega hacia la pagina de Sauce Demo
        When Inicia sesion con credenciales validas
        And Agrega un producto al carrito de compras
        And Completa el proceso de compra
        Then Deberia visualizar la pagina de confirmacion de compra

