package com.example.myapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Onibus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private int numeroSerie;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataFabricacao;

    @Column(nullable = false)
    private String linha;

    @Column(unique = true, nullable = false)
    private String placa;

    private String cor;

    @Column(nullable = false)
    private boolean autonomo;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private com.example.myapp.entity.Empresa empresa;
}
