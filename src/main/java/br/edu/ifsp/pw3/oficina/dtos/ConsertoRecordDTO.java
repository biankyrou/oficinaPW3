package br.edu.ifsp.pw3.oficina.dtos;

import br.edu.ifsp.pw3.oficina.models.Mecanico;
import br.edu.ifsp.pw3.oficina.models.Veiculo;
import jakarta.persistence.Embedded;

public record ConsertoRecordDTO(String data_entrada, String data_saida,
                                MecanicoRecordDTO mecanico, VeiculoRecordDTO veiculo) {
}
