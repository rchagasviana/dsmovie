package com.devsuperior.dsmovie.controllers;


import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    private final MovieService service;

    @GetMapping
    public Page<MovieDTO> buscarTodos(Pageable pageable) {
        return service.buscarTodos(pageable);
    }

    @GetMapping(value = "/{id}")
    public MovieDTO buscarFilme(@PathVariable Long id) {
        return service.buscarFilme(id);
    }
}
