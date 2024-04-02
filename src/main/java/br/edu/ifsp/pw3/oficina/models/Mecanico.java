package br.edu.ifsp.pw3.oficina.models;


import br.edu.ifsp.pw3.oficina.dtos.MecanicoRecordDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome_mecanico;
    private int anos_experiencia;

    public Mecanico(MecanicoRecordDTO dados){
        this.nome_mecanico = dados.nome_mecanico();
        this.anos_experiencia = dados.anos_experiencia();
    }
}
