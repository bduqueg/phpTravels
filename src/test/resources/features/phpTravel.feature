#autor: Brandon Duque Granda

  Feature: creacion de una nueva categoria en el apartado de BLOG del portal de php travels para crear un post
    asociado a la categoria agregada anteriormente

  @tag1
  Scenario: crear nueva categoria en el portal web de php travels para agregar un nuevo post asociado
    Given que el usuario inicie sesion en el portal web
    When crea una nueva categoria
    And valida que la categoria haya quedado agregada como technology
    Then crea el nuevo post
    And valida que haya quedado agregado el post como la tecnologia y su avances