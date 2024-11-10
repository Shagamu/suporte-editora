package com.curso.domains.enums;

public enum Conservacao {
    EXCELENTE(0, "EXCELENTE"), BOM(1,"BOM"), MARCADEUSO(2, "MARCA DE USO"), GASTO(3,"GASTO");

    private Integer idConserva;
    private String situacao;

    Conservacao(Integer idConserva, String situacao) {
        this.idConserva = idConserva;
        this.situacao = situacao;
    }

    public Integer getIdConserva() {
        return idConserva;
    }

    public void setIdConserva(Integer idConserva) {
        this.idConserva = idConserva;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public static Conservacao toEnum(Integer idConserva){
        if(idConserva==null) return null;
        for(Conservacao x : Conservacao.values()){
            if(idConserva.equals(x.getIdConserva())){
                return x;
            }
        }
        throw new IllegalArgumentException("Estado de livro inválido!");
    }
}
