package com.example.domain;


import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;

@Data /*@Entity @Table(name = "individuo")*/
public class Individuo /*implements Serializable*/ {

    /* private static final long serialVersionuid = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo; */
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String edad;
}
