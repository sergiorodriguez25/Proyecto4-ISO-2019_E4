@featureTest
Feature: Comprobar la correcta visualizacion de citas

  @Scenario1
  Scenario: Al acceder a esta pagina se tienen que mostrar el nombre y apellidos del usuario logeado
    Given Estoy en la pagina de registro
    And Se introducen los datos de registro
    And Se pulsa el boton enviar
    When Se abre la pagina de citas
    Then Se muestran el nombre y apellidos del usuario que ha iniciado sesion
    
    
  @Scenario2
  Scenario: Al acceder a la pagina de citas se tienen que mostrar todas las citas del usuario que ha iniciado sesion
  	Given Tenemos una cita
  	And Se registra un medico
  	And Insertamos una cita
  	And Estamos en la pagina principal
    And Se introducen las credenciales validas
    And Se pulsa el boton de iniciar sesion
  	When Se abre la pagina de citas
  	Then Se muestran todas las citas del paciente
  	
  	
  @Scenario3
  Scenario: Al solicitar las citas de un paciente recibo la informacion de la cita 
  	Given Tenemos un paciente
  	When Solicito las citas del paciente
  	Then Devuelve las citas del paciente
 