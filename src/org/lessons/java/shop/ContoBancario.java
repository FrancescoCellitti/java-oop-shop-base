package org.lessons.java.shop;

import java.math.BigDecimal;

public class ContoBancario {
    private int conto;
    private BigDecimal saldo;

    public ContoBancario(){
        this.conto = (int)(Math.random() * 100000) + 1;
        this.saldo = BigDecimal.ZERO;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo=saldo;
    }

    public int getConto(){
        return conto;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }
}
