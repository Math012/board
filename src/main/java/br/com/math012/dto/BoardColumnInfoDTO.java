package br.com.math012.dto;

import br.com.math012.persistence.entity.enums.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
