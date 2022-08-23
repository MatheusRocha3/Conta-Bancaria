package com.contabancaria.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contabancaria")
public class ContaBancariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 6, nullable = false)
    private String numeroDaConta;

    @Column(length = 4, nullable = false)
    private String agencia;

    @Column(length = 30, nullable = false)
    private String nomeDoUsuario;

    @Column(length = 30, nullable = false)
    private BigDecimal valorAtualDaConta;

    @Column
    private BigDecimal valorFinal;

    @Column(length = 30, nullable = false)
    private BigDecimal valorFornecido;

    @Column(length = 20, nullable = false)
    private String tipoDeServico;
}
