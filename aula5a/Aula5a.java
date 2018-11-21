package aula5a;
public class Aula5a {
  public static void main(String[] args) {
    Conta p1 = new Conta();
    p1.setNumConta(123);
    p1.setDono("Jublieu");
    p1.abrirConta("cc");
   
  
    Conta p2 = new Conta();
    p2.setNumConta(456);
    p2.setDono("Creyza");
    p2.abrirConta("cp");
    
    p1.depositar(50);
    p2.sacar(110);
    
    p2.impressao();
    p1.impressao();
 }
}
