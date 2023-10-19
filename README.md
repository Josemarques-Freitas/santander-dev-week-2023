# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week.


## Diagrama de Classes (Domínio da API)

```mermaid
class User {
  - String nomeEstabelecimento
  - Address endereco
  - Contact contato
  - OperatingHours horarioFuncionamento
  - List<String> servicosOferecidos
  - Map<String, String> precos
}

class Address {
  - String rua
  - String cidade
  - String estado
}

class Contact {
  - String telefone
  - String instagran
}

class OperatingHours {
  - String segundaFeira
  - String tercaFeira
  - String quartaFeira
  - String quintaFeira
  - String sextaFeira
  - String sabado
  - String domingo
}

```

## IMPORTANTE

Este projeto foi construído com um viés totalmente educacional para a DIO. Por isso, disponibilizamos uma versão mais robusta dele no repositório oficial da DIO:

### [digitalinnovationone/santander-dev-week-2023-api](https://github.com/digitalinnovationone/santander-dev-week-2023-api)

Lá incluímos todas os endpoints de CRUD, além de aplicar boas práticas (uso de DTOs e refinamento na documentação da OpenAPI). Sendo assim, caso queira um desafio/referência mais completa é só acessar 👊🤩
