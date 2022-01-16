package com.devsuperior.dsmovie.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long movieId;
    private String email;
    private Double score;




}
