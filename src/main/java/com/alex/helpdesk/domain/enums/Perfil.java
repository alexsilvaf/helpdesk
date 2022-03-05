package com.alex.helpdesk.domain.enums;

public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descicao;

    Perfil(Integer codigo, String descicao) {
        this.codigo = codigo;
        this.descicao = descicao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public static Perfil toEnum(Integer code){
        if(code == null){
            return null;
        }

        for(Perfil x : Perfil.values()){
            if(code.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Perfil inválido");
    }
}
