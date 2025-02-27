package br.com.math012.persistence.entity;

import br.com.math012.persistence.entity.enums.BoardColumnKindEnum;
import lombok.Data;

@Data
public class BoardColumnEntity {
    private Long id;
    private String nome;
    private int order;
    private BoardColumnKindEnum kind;
}
