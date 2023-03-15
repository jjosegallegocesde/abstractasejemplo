package org.example;

import java.time.LocalDate;

public class ClienteG1 extends Cliente {

    protected final Integer TOPE_COMPRAS=1000000;

    public ClienteG1(String nombre, String cedula, Long totalCompra, LocalDate fechaCompra) {
        super(nombre, cedula, totalCompra, fechaCompra);
    }

    @Override
    public Double calcularPago() {
        Double cantidadDescuentos = (double)this.getTotalCompra()/this.TOPE_COMPRAS;
        Integer total= cantidadDescuentos.intValue();
        System.out.println("se aplican: "+total);
        return cantidadDescuentos;
    }
}
