package estojo;
public class Estojo {
  public static void main(String[] args) {
    Conteudo c1 = new Conteudo();
    c1.modelo = "mickey";
    c1.cor = "cinza";
    c1.quantidade = 0;
    c1.coisas();
    c1.status();
    
    System.out.println("\n");
    Conteudo c2 = new Conteudo();
    c2.modelo="bela adormecida";
    c2.cor = "beje";
    c2.quantidade = 14;
    c2.coisasDiferentes = 3;
    c2.coisas();
    c2.status();
  }
  
}
