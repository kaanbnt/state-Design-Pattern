package com.uniyaz.satete;

/**
 * AtletDurumu
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class AtletDurumu implements Durum {
    private Durum basla;
    private Durum kos;
    private Durum bitir;

    private Durum durum;

    public AtletDurumu() {
        this.basla = new BaslamaDurumu(this);
        this.kos = new KosmaDurumu(this);
        this.bitir = new BitirmeDurumu(this);

        this.durum = basla;
    }

    @Override
    public void basla() {
        durum.basla();
    }

    @Override
    public void kos() {
        durum.kos();
    }

    @Override
    public void bitir() {
        durum.bitir();
    }

    public Durum getBasla() {
        return basla;
    }

    public void setBasla(Durum basla) {
        this.basla = basla;
    }

    public Durum getKos() {
        return kos;
    }

    public void setKos(Durum kos) {
        this.kos = kos;
    }

    public Durum getBitir() {
        return bitir;
    }

    public void setBitir(Durum bitir) {
        this.bitir = bitir;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }
}
