package tdi.training.java.core.model.nasabah;

import java.math.BigDecimal;

public class NasabahPerorangan{
    String namaLengkap, alamatRumah, nomorHp, foto;
    Tabungan tabungan;

    //Konstruktor
    public NasabahPerorangan(String nomorIdentitas, String namaLengkap, String alamat, String nomorHp, BigDecimal saldo) {
        super.nomorIdentitas(nomorIdentitas);
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamat;
        this.nomorHp = nomorHp;
        super.active(false);
        super.saldo(BigDecimal.zero);
    }

    public String getNamaLengkap() {

    }

    public void setNamaLengkap (String namaLengkap){

    }

    public String getAlamatRumah() {

    }

    public void setAlamatRumah(String alamatRumah){

    }

    public String getNomorHp(){

    }

    public void setNomorHp(String nomorHp){

    }

    public String getFoto(){

    }

    public void setFoto(String foto){

    }


}