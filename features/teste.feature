@google
Feature: campo_pesquisa

  @tag1
  Scenario: pesquisa no google
    Given que esteja na pagina do google
    When escrevo no campo de pesquisa
    Then sou redirecionado para a pesquisa feita
