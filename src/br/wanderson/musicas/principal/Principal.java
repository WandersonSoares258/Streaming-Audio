package br.wanderson.musicas.principal;

import br.wanderson.musicas.modelos.Musicas;
import br.wanderson.musicas.modelos.Podcast;
import br.wanderson.musicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {

        Musicas musica1 = new Musicas();
        musica1.setAlbum("dois");
        musica1.setCantor("carlos");
        musica1.setTitulo("ciclete");

        for (int i = 0; i < 200; i++) {

            musica1.reproduz();

        }

        for (int i = 0; i < 500; i++) {
            musica1.curte();
        }

        Podcast podpa = new Podcast();
        podpa.setApresentador("gustavo");
        podpa.setConvidados("filipe e douglas");
        podpa.setTitulo("a casa nova");
        podpa.setDescricao("vamos falar hoje sobre uma das melhores casas que ja existiu aqui no PODPA");


        for (int i = 0; i < 5000; i++) {
            podpa.reproduz();

        }

        for (int i = 0; i < 2000; i++) {
            podpa.curte();

        }

        Preferidas melhores = new Preferidas();
        melhores.inclui(podpa);
        melhores.inclui(musica1);

    }




}
