package aula.pkg4;
public class Caneta {
  public String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;
  
  public Caneta(String m, String c, float p){ //metodo construtor
    this.modelo = m;
    this.cor = c;
    this.setPonta(p);
    this.tampar();
  }
  
  public String getModelo(){
    return this.modelo;
    }
  public void setModelo(String m) {
    this.modelo = m;
  }
  public float getPonta(){
    return this.ponta;
  }
  public void setPonta (float p) {
    this.ponta = p;
  }
  
  public void tampar() {
   this.tampada = true;
  }
  public void destampada() {
    this.tampada = false;
  }
  public void status(){
    System.out.println("Sobre a caneta");
    System.out.println("\tmodelo: "+ this.modelo); //mesma coisa do de baixo
    System.out.println("\tponta: "+ this.getPonta());
    System.out.println("\tcor: "+this.cor);
    System.out.println("\ttampada: "+this.tampada);
  }
  
  
}
