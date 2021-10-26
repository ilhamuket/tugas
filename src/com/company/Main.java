package com.company;

public class Main {

    private String nama;
    private int stock;
    private int harga;
    private int total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total, int harga) {
        this.total = stock * harga;
    }


    public static void main(String[] args) {
        int totalsemua;

        Main barang1 = new Main();
        barang1.setNama("Bolpoin");
        barang1.setStock(10);
        barang1.setHarga(2000);
        barang1.setTotal(10,2000);
        int a = barang1.getTotal();

        Main barang2 = new Main();
        barang2.setNama("Pensil");
        barang2.setStock(10);
        barang2.setHarga(1000);
        barang2.setTotal(10,1000);
        int b = barang2.getTotal();

        Main barang3 = new Main();
        barang3.setNama("Penghapus");
        barang3.setStock(10);
        barang3.setHarga(500);
        barang3.setTotal(10,500);
        int c = barang3.getTotal();


        System.out.println("\nNama Barang : "+ barang1.getNama());
        System.out.println("Jumlah Stock : "+ barang1.getStock());
        System.out.println("Harga Barang : "+ barang1.getHarga());
        System.out.println("Total Harga : "+barang1.getTotal());

        System.out.println("\nNama Barang : "+ barang2.getNama());
        System.out.println("Jumlah Stock : "+ barang2.getStock());
        System.out.println("Harga Barang : "+ barang2.getHarga());
        System.out.println("Total Harga : "+barang2.getTotal());

        System.out.println("\nNama Barang : "+ barang3.getNama());
        System.out.println("Jumlah Stock : "+ barang3.getStock());
        System.out.println("Harga Barang : "+ barang3.getHarga());
        System.out.println("Total Harga : "+barang3.getTotal());

        totalsemua = a + b + c;
        System.out.println("\nTotal Harga Keseluruhan : "+totalsemua);
    }
}