package com.uniyaz.satete;

/**
 * Baslama
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class BaslamaDurumu implements Durum {

    private final AtletDurumu atletDurumu;

    public BaslamaDurumu(AtletDurumu atletDurumu) {
        this.atletDurumu = atletDurumu;
    }

    @Override
    public void basla() {
        System.out.println("Yarış Zaten Başladı ");
    }

    @Override
    public void kos() {
        System.out.println("Atlet Koşuya Başladı");
        atletDurumu.setDurum(atletDurumu.getKos());
    }

    @Override
    public void bitir() {
        System.out.println("Atlet Yarışı Bitiyor");
        atletDurumu.setDurum(atletDurumu.getBitir());
    }
}
