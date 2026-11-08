package kelas.model;

/**
 *
 * @author LOQ
 */
public class Produk {
 private final String namaProduk; 
 private final String kategori;
 private final int hargaProduk;
 private final int kodeProduk;
 private final String gambarProduk;
 
 public Produk(String nama, String kategori, int hargaProduk, int kodeProduk, String gambarProduk) {
  if(nama == null || nama.isBlank()) throw new IllegalArgumentException("Nama wajib diisi.");
  if(hargaProduk <= 0) throw new IllegalArgumentException("Harga harus lebih dari nol.");
  this.namaProduk=nama.trim(); this.kategori = kategori;
  this.hargaProduk=hargaProduk; this.kodeProduk=kodeProduk;
  this.gambarProduk=gambarProduk;
  
 }
 public String getNamaProduk(){return namaProduk;}
 public String getKategori(){return kategori;}
 public int getHargaProduk(){return hargaProduk;}
 public int getKodeProduk (){return kodeProduk;}
 public String getGambarProduk(){return gambarProduk;}
}
