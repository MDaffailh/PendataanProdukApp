package kelas.controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import kelas.Navigator;
import kelas.model.Produk;

public class DetailController {

    @FXML
    private Label kodeLabel, namaLabel, jenisLabel,pesanLabel, hargaLabel;
    @FXML
    private ImageView gambarView;
    private Navigator navigator;

    public void setData(Navigator navigator, Produk p) {
        this.navigator = navigator;
        kodeLabel.setText(String.valueOf(p.getKodeProduk()));
        namaLabel.setText(p.getNamaProduk());
        jenisLabel.setText(p.getKategori());
        hargaLabel.setText(String.valueOf(p.getHargaProduk()));
        if (p.getGambarProduk() != null) {
            Image image = new Image(p.getGambarProduk(), 640, 480, true, true);
            if (image.isError()) {
                pesanLabel.setText("Lampiran tidak ditemukan atau tidak dapat dibaca.");
            } else {
                gambarView.setImage(image);
            }
        } else {
            pesanLabel.setText("Tanpa lampiran gambar.");
        }
    }

    @FXML
    private void tambahLagi() {
        try {
            navigator.bukaForm();
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka form.");
            e.printStackTrace();
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka daftar.");
            e.printStackTrace();
        }
    }
}
