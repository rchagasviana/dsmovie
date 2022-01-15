package com.devsuperior.dsmovie.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_movie")
public class Movie implements Serializable {
	private static final long serialVersionUID = 326577449391477440L;

	@Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private Double score;

    @Getter
    @Setter
    private Integer count;

    @Getter
    @Setter
    private String image;
}
