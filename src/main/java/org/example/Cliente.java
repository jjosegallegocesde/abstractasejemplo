package org.example;

import java.time.LocalDate;

public abstract class Cliente {

    private String nombre;
    private String cedula;
    private Long totalCompra;
    private LocalDate fechaCompra;

    public abstract Double calcularPago();

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, Long totalCompra, LocalDate fechaCompra) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.totalCompra = totalCompra;
        this.fechaCompra = fechaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Long getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Long totalCompra) {
        this.totalCompra = totalCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
