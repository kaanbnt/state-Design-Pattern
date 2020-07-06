package com.uniyaz.satete;

/**
 * BitirmeDurumu
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class BitirmeDurumu implements Durum{

    private final AtletDurumu atletDurumu;

    public BitirmeDurumu(AtletDurumu atletDurumu) {
        this.atletDurumu = atletDurumu;
    }

    @Override
    public void basla() {
        System.out.println("Atlet Koşuyu Bitirdi");
    }

    @Override
    public void kos() {
        System.out.println("Atlet Koşuyu Bitirdi");
    }

    @Override
    public void bitir() {
        System.out.println("Atlet Yarışı Bitirdi");
        atletDurumu.setDurum(atletDurumu.getBitir());
    }
}
