package com.devsuperior.dsmovie.services;


import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> buscarTodos(Pageable pageable) {
        Page<Movie> filmes = repository.findAll(pageable);
        Page<MovieDTO> page = filmes.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO buscarFilme(Long id) {
        Movie filme = repository.findById(id).get();
        MovieDTO dto = new MovieDTO(filme);
        return dto;
    }


}
