package kelas.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kelas.model.Produk;

public class DataProduk{

    private final ObservableList <Produk> daftar = FXCollections.observableArrayList();

    public ObservableList<Produk> getDaftar() {
        return FXCollections.unmodifiableObservableList(daftar);
    }

    public void tambah(Produk p) {
        //TR%03d  Bagian ini digunakan untuk membuat kode pembelian, misalnya TR001, TR002, dan seterusnya.
        daftar.add(p);
    }

    public void hapus(Produk p) {
        daftar.remove(p);
    }
}
