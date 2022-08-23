package com.contabancaria.model.ContaBancariaFactory;

public class ContaBancariaFactory {
    public CalcularValorFinal getStatusConta(String status) {
        if(status.equalsIgnoreCase("deposito")) {
            return new Deposito();
        } else if(status.equalsIgnoreCase("saque")) {
            return new Saque();
        } else {
            return null;
        }
    }
    }


