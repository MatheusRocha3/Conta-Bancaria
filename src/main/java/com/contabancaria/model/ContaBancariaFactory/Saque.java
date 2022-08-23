package com.contabancaria.model.ContaBancariaFactory;

import java.math.BigDecimal;

public class Saque implements CalcularValorFinal{

    @Override
    public BigDecimal calcularValorFinal(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal valorfinal = valorAtualDaConta.subtract(valorFornecidoParaSaqueOuDeposito);
        return valorfinal;
    }
    }

