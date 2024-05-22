package com.example.Busa1.service;

import com.example.Busa1.repository.OnibusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myapp.entity.Onibus;


import java.util.List;

@Service
public class OnibusService {

    @Autowired
    private OnibusRepository onibusRepository;

    public Onibus saveOnibus(Onibus onibus) {
        return onibusRepository.save(onibus);
    }

    public List<Onibus> getAllOnibus() {

        return onibusRepository.findAll();
    }

    public Onibus getOnibusById(Long id) {

        return onibusRepository.findById(id).orElse(null);
    }

    public void deleteOnibus(Long id) {
        onibusRepository.deleteById(id);
    }
}
