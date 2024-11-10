package com.curso.domains.enums;

public enum Status {

    NAOLIDO(0, "NÃO LIDO"), LENDO(1, "LENDO"), LIDO(2, "LIDO");

    private Integer idStatus;
    private String situacao;

    Status(Integer idStatus, String situacao) {
        this.idStatus = idStatus;
        this.situacao = situacao;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setId(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public static Status toEnum(Integer idStatus){
        if(idStatus==null) return null;
        for(Status x : Status.values()){
            if(idStatus.equals(x.getIdStatus())){
                return x;
            }
        }
        throw new IllegalArgumentException("Status Invalido!");
    }
}
