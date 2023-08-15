import entities.Iphone;

public class Main {
  public static void main(String[] args) {
    Iphone x = new Iphone();

    x.adicionarNovaAba();
    x.exibirPagina();

    x.iniciarCorreioDeVoz();
    x.atender();
  }
}