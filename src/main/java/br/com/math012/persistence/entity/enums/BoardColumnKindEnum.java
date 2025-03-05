package br.com.math012.persistence.entity.enums;

import java.util.stream.Stream;

public enum BoardColumnKindEnum {

    INITIAL, FINAL, CANCEL, PENDING;


    public static BoardColumnKindEnum findByName(final String name){
        return Stream.of(BoardColumnKindEnum.values())
                .filter(n -> n.name().equals(name)).findFirst().orElseThrow();
    }
}
