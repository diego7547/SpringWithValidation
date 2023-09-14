package com.example.controller;

import com.example.modal.Alumno;
import com.example.repo.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoRepo alumnoRepo;


    @PostMapping("")
    public Alumno saveAlumno(@RequestBody @Validated Alumno alumno){
        return  alumnoRepo.save(alumno);
    }
}
