# Santander-Week-Projeto-Final
RESTfull API para Projeto de conclusão do SDW-2023.

## Diagrama de classes

```mermaid
classDiagram
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

User "1" *-- "N" Address
User "1" *-- "N" Contact
User "1" *-- "N" OperatingHours
```
