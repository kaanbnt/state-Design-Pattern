package com.uniyaz.satete;

/**
 * KosmaDurumu
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class KosmaDurumu implements Durum {

    private final AtletDurumu atletDurumu;

    public KosmaDurumu(AtletDurumu atletDurumu) {
        this.atletDurumu = atletDurumu;
    }

    @Override
    public void basla() {
        System.out.println("Atlet Koşuya Başladı");
    }

    @Override
    public void kos() {
        System.out.println("Atlet Zaten Koşuyor");
    }

    @Override
    public void bitir() {
        System.out.println("Atlet Yarışı bitiriyor");
        atletDurumu.setDurum(atletDurumu.getBitir());
    }
}
