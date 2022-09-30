package com.br.security.controller;

import com.br.security.entity.CarroEntity;
import com.br.security.service.CarroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log4j2
@RestController
@RequestMapping("carro")
@RequiredArgsConstructor
public class CarroController {

    private final CarroService carroService;
    private String msg;

    @GetMapping("status")
    public ResponseEntity status() {
        msg = "GET CarroController status: Consultando Status da API.";
        log.warn(msg);
        return ResponseEntity.ok(msg);
    }

    @PostMapping("salvar")
    public ResponseEntity salvar(@RequestBody CarroEntity carroEntity) {
        msg = "GET CarroController salvar: Salvando carro.";
        log.warn(msg);
        CarroEntity retornoSalvo = carroService.salvar(carroEntity);
        return ResponseEntity.ok(retornoSalvo);
    }

    @GetMapping("listar")
    public ResponseEntity listar() {
        msg = "GET CarroController listar: Listando todos os carros salvos.";
        log.warn(msg);
       List<CarroEntity> resultList = carroService.listar();
        if (resultList.isEmpty())
            return ResponseEntity.ok("Sem registros.");
        return ResponseEntity.ok(resultList);
    }
}
