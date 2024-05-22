package com.example.Busa1.controller;

import com.example.Busa1.service.OnibusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.myapp.entity.Onibus;


import java.util.List;

@RestController
@RequestMapping("/api/onibus")
public class OnibusController {

    @Autowired
    private OnibusService onibusService;

    @PostMapping
    public Onibus createOnibus(@RequestBody Onibus onibus) {
        return onibusService.saveOnibus(onibus);
    }

    @GetMapping
    public List<Onibus> getAllOnibus() {
        return onibusService.getAllOnibus();
    }

    @GetMapping("/{id}")
    public Onibus getOnibusById(@PathVariable Long id) {
        return onibusService.getOnibusById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOnibus(@PathVariable Long id) {
        onibusService.deleteOnibus(id);
    }
}
