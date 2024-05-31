package org.mudanzasalegre.gestionTaquillasDos.model;

public enum Sexo {
    M("Masculino"),
    F("Femenino"),
    O("Otro");

    private final String descripcion;

    Sexo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
