#Author: Ronald Herazo
  @stories
  Feature: random purchase on exito
    As a user, I want to log in to the exito page and randomly select 5 products and add random quantities of the products to the cart.
  @scenario1
  Scenario: randomly add products and product quantities to the cart
    Given than I enters the exito page
    And select a category
    And select a subcategory
    When randomly selects five products
    Then the name of the aggregated products are equeals in the cart
    And The total of the prices of the products added should be the same as in the cart
    And The quantities of the products added must be the same as in the cart
    And The number of products added must be the same as in the cart