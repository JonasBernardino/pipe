package com.pie.pipe.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {

    public BigDecimal calcularDesconto(BigDecimal total, boolean clienteVip, boolean temCupom) {
        if (clienteVip) {
            if (total.compareTo(new BigDecimal("500")) > 0) {
                return total.multiply(new BigDecimal("0.15"));
            } else {
                return total.multiply(new BigDecimal("0.10"));
            }
        } else {
            if (temCupom) {
                return total.multiply(new BigDecimal("0.05"));
            } else {
                return BigDecimal.ZERO;
            }
        }
    }

    public int dividir(int numero, int divisor) {
        return numero / divisor;
    }

    public boolean isMaiorDeIdade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}