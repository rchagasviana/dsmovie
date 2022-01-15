package com.devsuperior.dsmovie.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@Entity
@Table(name = "tb_score")
public class Score {

    @Getter
    @EmbeddedId
    private ScorePK id = new ScorePK();

    @Getter
    @Setter
    private Double value;

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }


}
