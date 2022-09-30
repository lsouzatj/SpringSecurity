package com.br.security.service;

import com.br.security.entity.CarroEntity;
import com.br.security.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarroService {
    private final CarroRepository carroRepository;

    @Transactional
    public CarroEntity salvar(CarroEntity carroEntity){
        return carroRepository.save(carroEntity);
    }

    public List<CarroEntity> listar(){
        return carroRepository.findAll();
    }
}
