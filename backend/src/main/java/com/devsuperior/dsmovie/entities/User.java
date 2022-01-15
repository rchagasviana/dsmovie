package com.devsuperior.dsmovie.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = -7698133682362662195L;


	@Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Getter
    @Setter
    private String email;

}
