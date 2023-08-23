package br.wanderson.musicas.modelos;

public class Musicas extends Audio{

    private int anoDeLancamento;
    private String genero;
    private String cantor;
    private String album;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
