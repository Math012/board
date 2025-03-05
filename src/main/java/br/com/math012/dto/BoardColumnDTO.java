package br.com.math012.dto;

import br.com.math012.persistence.entity.enums.BoardColumnKindEnum;

public record BoardColumnDTO (Long id,
                              String name,
                              BoardColumnKindEnum kind,
                              int cardsAmount){
}
