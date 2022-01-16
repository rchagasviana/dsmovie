package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScoreService {

    private final ScoreRepository repository;
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    @Transactional
    public MovieDTO salvarScore(ScoreDTO dto) {
        User usuario = userRepository.findByEmail(dto.getEmail());

        if (usuario == null) {
            usuario = new User();
            usuario.setEmail(dto.getEmail());
            usuario = userRepository.saveAndFlush(usuario);
        }

        Movie filme = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setUser(usuario);
        score.setMovie(filme);
        score.setValue(dto.getScore());
        score = repository.saveAndFlush(score);

        double soma = 0;
        for (Score s : filme.getScores()) {
            soma = soma + s.getValue();
        }
        double media = soma / filme.getScores().size();
        filme.setScore(media);
        filme.setCount(filme.getScores().size());
        filme = movieRepository.save(filme);

        return new MovieDTO(filme);
    }


}
