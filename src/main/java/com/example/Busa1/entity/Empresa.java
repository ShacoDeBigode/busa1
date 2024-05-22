package com.example.myapp.entity;

import com.example.Busa1.repository.OnibusRepository;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private int qtdFuncionarios;

    @Column(nullable = false)
    private double faturamentoAnual;

    @Column(unique = true, nullable = false)
    private String telefone;

    private String webSites;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private String servicoPrestado;

    private String porte;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OnibusRepository> onibusRepositories;
}
