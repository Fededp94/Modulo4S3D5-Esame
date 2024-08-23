package com.example.catalogo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Utente {
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    private String cognome;

    @Temporal(TemporalType.DATE)
    private Date dataNascita;

    @Column(unique = true)
    private String numeroTessera;

}

