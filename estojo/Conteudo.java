package estojo;
public class Conteudo {
    String modelo;
    String cor;
    int quantidade;
    boolean coisas;
    int coisasDiferentes;
    void status(){
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Quantidade: " + this.quantidade);
      System.out.println("Coisas:" + this.coisas);
      System.out.println("Cor: " + this.cor);
      System.out.println("Coisas diferentes: " + this.coisasDiferentes);
    }
    
    void coisas() {
      if(quantidade == 0){
        this.coisas=false;
        this.coisasDiferentes = 0;
      }
      else this.coisas=true;
    }
    
   
}
