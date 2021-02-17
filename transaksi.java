package clases;
import java.util.ArrayList;

public class transaksi {

    private String noTransaksi;
    private String namaPesanan;
    private String tanggal;
    private String noMeja;

    private ArrayList <pesanan> pesanans;
    private double uangBayar;
    private double pajak;
    private double totalBayar;

    private transaksi (String no_transaksi, String nm_pemesan, String tunggal, String nm_meja) {}
    public void tambahPesanan (pesanan pesanan) {}
    public pesanan getPesanan() {return  null ;}

    public ArrayList <pesanan> getSemuaPesanan() {return null ;}
    public double hitungTotalBayar() {return  0;}
    public double hitungKembalian() {return 0;}
    public void cetakStruk() {}


}
