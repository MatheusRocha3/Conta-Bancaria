package com.contabancaria.model.ContaBancariaFactory;
import java.math.BigDecimal;
public interface CalcularValorFinal {
    public BigDecimal calcularValorFinal(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito);
}
