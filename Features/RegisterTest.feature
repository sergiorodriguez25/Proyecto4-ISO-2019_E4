@featureTest
Feature: Comprobar el correcto funcionamiento del registro de un usuario

  @Scenario1
  Scenario: Al introducir los datos y pulsar el boton de registrarse, entra en la pagina de citas con el usuario ya registrado
    Given Estamos en la pagina de registro
    When Se introducen todos los datos
    And Se pulsa el boton
    Then Se abre la pagina de citas
