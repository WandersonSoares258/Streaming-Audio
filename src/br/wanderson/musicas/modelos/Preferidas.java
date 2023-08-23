package br.wanderson.musicas.modelos;

public class Preferidas {


    public void inclui (Audio audio){

      if (audio.getClassificacao() >=9){
          System.out.println(audio.getTitulo() + " Considerado melhor de todas");
      }else {
          System.out.println(audio.getTitulo() + " Muitos estao curtindo no momento");
      }

    }

}
