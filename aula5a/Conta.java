package aula5a;
public class Conta {
  //atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private double saldo;
  private boolean status;
  //Métodos personalizados
  public void depositar(double valor) {
    if(this.getStatus()) this.setSaldo(this.getSaldo()+ valor);
    else System.out.println("Conta fechada, vai depositar como parsa?");
  }
  
  public void sacar(double valor) {
    if(this.getStatus()) 
      if(this.getSaldo()>= valor){
        this.setSaldo(this.getSaldo()-valor);
        System.out.println("Saldo apos saque:"+this.getSaldo());
      }
  }
  
  public void pagarMensalidade(){
    int mensalidade = 0;
    if(this.getTipo().equals("CC")) mensalidade = 12;
    
    else if (this.getTipo().equals("CP"))mensalidade = 20;
    
    if(this.getStatus()) {
      this.setSaldo(this.getSaldo() - mensalidade);
      System.out.println("Mensalidade paga por: "+ this.getDono());
      System.out.println("Saldo após mensalidade"+this.getSaldo());
    }
    else System.out.println("Impossivel pagar devido à conta fechada");
    
  }
//metodos get/set
  public Conta() {
    this.setSaldo(0);
    this.setStatus(false);
  }
  
  public void abrirConta(String t) {
    t = t.toUpperCase( );
    this.setTipo(t);
    this.setStatus(true);
    if("CC".equals(t)) this.setSaldo(50);
    else if("CP".equals(t)){
      this.setSaldo(150);
      System.out.println("Conta aberta?"+status);
      
    }
    
  } 
    
  public void fecharConta () {
    if (saldo>0) System.out.println("Conta tem dinheiro");
    else if(saldo<0) System.out.println("Conta em debito");
    else {
      setStatus(false);
      System.out.println("Conta aberta? "+status);
    }
  }
  
  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
 
  public void impressao (){
    System.out.println("__________________________");
    System.out.println("status: " + getStatus());
    System.out.println("tipo: " + getTipo());
    System.out.println("dono: "+ getDono());
    System.out.println("saldo: " + getSaldo());
    System.out.println("conta: " + getNumConta());
    System.out.println("__________________________");
  }
  
  
}