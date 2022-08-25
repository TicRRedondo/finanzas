package com.celulaMinTic.ManejoFinanzas.entities;

public class ManejoDinero {

    private int userId;
    private float monto;
    private String concepto;

    public ManejoDinero(int userId, float monto) {
        this.userId = userId;
        this.monto = monto;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
