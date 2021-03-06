package com.devsuperior.dsmovie.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class ScorePK implements Serializable {
	private static final long serialVersionUID = -1506221145674807282L;

	@ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
