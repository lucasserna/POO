
package javaapplication1;
public class JavaApplication1 {
  public static void main(String[] args) {
   Caneta c1 = new Caneta();
   c1.cor="azul";
   c1.ponta=0.7f;
   c1.modelo="bic";
   c1.destampar();
   c1.rabiscar();
   c1.status();
   
    System.out.println("\n\n");
   Caneta c2 = new Caneta();
   c2.cor = "preta";
   c2.ponta = 0.5f;
   c2.modelo = "le blanc";
   c2.tampar();
   c2.rabiscar();
   c2.status();
    }
    
}
