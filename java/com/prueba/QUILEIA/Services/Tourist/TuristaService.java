package com.prueba.QUILEIA.Services.Tourist;

import com.prueba.QUILEIA.Models.Tourist.Turista;
import com.prueba.QUILEIA.Repository.Tourist.TuristaRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuristaService {

    @Autowired
    private TuristaRepositoryJpa repositoryJpa;


    public Turista getTuristaId(Integer id){
        return repositoryJpa.findById(id).get();
    }
}
