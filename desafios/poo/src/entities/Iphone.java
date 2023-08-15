package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

  @Override
  public void tocar(String musica) {
    System.out.println("Playing " + musica);
  }

  @Override
  public void pausar() {
    System.out.println("Pause");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Playing " + musica);
  }

  @Override
  public void exibirPagina() {
    System.out.println("Loading page");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("New tab");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Refreshing page");
  }

  @Override
  public void ligar(String contato) {
    System.out.println("Calling " + contato);
  }

  @Override
  public void atender() {
    System.out.println("Answering call");
  }

  @Override
  public void iniciarCorreioDeVoz() {
    System.out.println("Playing voice mail");
  }
  
}
