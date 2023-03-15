package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ClienteG1 cliente = new ClienteG1("juan","1234",2800000l, LocalDate.now());
        cliente.calcularPago();
    }
}