Feature: Automation Parabank
  Yo como ingeniero
  Necesito realizar la apertura de una nueva cuenta Ahorros
  Para verificar que me sea asignada

  Background:
    Given Deseo ir "https://parabank.parasoft.com/parabank/index.htm"
    When Ingresando usuario "deme1234" y password "deme1234"

  Scenario: Agregar cuenta
    Given Necesito agregar una nueva cuenta Ahorros
    When Seleccionando el tipo de cuenta Ahorros
    Then Valido la creacion de la nueva cuenta
