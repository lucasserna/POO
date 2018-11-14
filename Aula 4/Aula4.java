package aula.pkg4;
public class Aula4 {
  public static void main(String[] args) {
    Caneta c1= new Caneta("nic","amarelo", 0.4f);
    //c1.setModelo("BIC"); //usando metodo acessor
    //c1.modelo = "BIC"; //acessando diretamente funciona igual pois modelo é publico
    
    //c1.setPonta(0.5f);
    // c1.ponta = 0.5f; não funciona pois ponta é private
    c1.status();
    
    Caneta c2= new Caneta ("séloko", "laranja", 2.621f);
    c2.status();
  }
  
}
