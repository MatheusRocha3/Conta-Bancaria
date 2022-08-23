package com.contabancaria.model.ContaBancariaFactory;

import java.math.BigDecimal;

public class Deposito implements CalcularValorFinal {

    @Override
    public BigDecimal calcularValorFinal(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal valorfinal = valorAtualDaConta.add(valorFornecidoParaSaqueOuDeposito);
        return valorfinal;
    }
}
