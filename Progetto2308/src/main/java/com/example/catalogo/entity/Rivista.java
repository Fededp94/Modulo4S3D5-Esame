package com.example.catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends ElementoCatalogo {
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public enum Periodicita {
        SETTIMANALE, MENSILE, SEMESTRALE
    }
}
