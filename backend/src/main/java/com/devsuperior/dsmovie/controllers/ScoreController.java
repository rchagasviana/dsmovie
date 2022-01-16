package com.devsuperior.dsmovie.controllers;


import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/scores")
@RequiredArgsConstructor
public class ScoreController {

    private final ScoreService service;

    @PutMapping
    public MovieDTO salvarScore(@RequestBody ScoreDTO dto) {
        return service.salvarScore(dto);
    }


}
