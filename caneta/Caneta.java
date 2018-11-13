
package javaapplication1;
  public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
      System.out.println("caneta de cor: " + this.cor);
      System.out.println("esta tampada? " + this.tampada);
      System.out.println("modelo: " + this.modelo);
      System.out.println("carga: " + this.carga);
      System.out.println("ponta: " + this.ponta);
    }
    
    void rabiscar(){
      if(this.tampada == true) {
        System.out.println("Não é possível ");
      }
      else {
        System.out.println("Rabiscando horrores!");
      }
    }
    
    void tampar(){
      this.tampada = true;
    }
    
    void destampar(){
      this.tampada = false;
      
    }
}
