package tdi.training.java.core.model.aplikasi;

import java.math.BigDecimal;

public class Tabungan{
    Double sukuBunga;
    BigDecimal saldo, akrual;
    String kriteriaProduct;

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public BigDecimal getAkrual() {
        return this.akrual;
    }

    public void setAkrual(BigDecimal akrual){
        this.akrual = akrual;
    }

    public String getKriteriaProduct(){
        return kriteriaProduct;
    }

    public void setKriteriaProduct(String kriteriaProduct){
        this.kriteriaProduct = kriteriaProduct;
    }

    public Double getSukuBunga(){
        return this.sukuBunga;
    }

    public void setSukuBunga(Double sukuBunga){
        this.sukuBunga = sukuBunga;
    }

}