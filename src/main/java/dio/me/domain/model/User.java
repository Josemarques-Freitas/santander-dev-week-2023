package dio.me.domain.model;

import java.util.List;
import java.util.Map;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tb_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Address endereco;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contato;

    @OneToOne(cascade = CascadeType.ALL)
    private Operating horarioFuncionamento;

    @ElementCollection
    private List<String> servicosOferecidos;

    @ElementCollection
    @MapKeyColumn(name = "servico")
    @Column(name = "preco")
    @CollectionTable(name = "user_precos", joinColumns = @JoinColumn(name = "user_id"))
    private Map<String, String> precos;
}
