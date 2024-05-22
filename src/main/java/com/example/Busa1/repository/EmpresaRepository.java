package com.example.Busa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myapp.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
