package com.alex.helpdesk.domain.enums;

public enum Status {

    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descicao;

    Status(Integer codigo, String descicao) {
        this.codigo = codigo;
        this.descicao = descicao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public static Status toEnum(Integer code){
        if(code == null){
            return null;
        }

        for(Status x : Status.values()){
            if(code.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Status inválido");
    }
}
