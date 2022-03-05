package com.alex.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private Integer codigo;
    private String descicao;

    Prioridade(Integer codigo, String descicao) {
        this.codigo = codigo;
        this.descicao = descicao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public static Prioridade toEnum(Integer code){
        if(code == null){
            return null;
        }

        for(Prioridade x : Prioridade.values()){
            if(code.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Prioridade inválida");
    }
}
