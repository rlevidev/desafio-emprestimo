package com.rlevi.desafio_emprestimo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;
}
