
package aula07b;

import java.util.Random;

/*
 * @author lucas.serna
 */
public class Luta {
  private boolean aprovada;
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  //metodos especiais
  public Lutador getDesafiado() {
    return desafiado;
  }
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }
  public Lutador getDesafiante(){
    return desafiante;
  }
  public void setDesafiante(Lutador desafiante){
    this.desafiante = desafiante;
  }
  public boolean isAprovada(){
    return aprovada;
  }
  public void setAprovada(boolean aprovada){
    this.aprovada = aprovada;    
  }
  //metodos publicos
  public void marcarLuta(Lutador l1, Lutador l2) {
    if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2) {
      System.out.println("Luta Marcada");
      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);
      
      }
    else {
      System.out.println("Luta não pode ocorrer");
      this.setAprovada(false);
      this.setDesafiado(null);
      
    }
  }
  public void Lutar(){
    if(this.isAprovada()){
      System.out.print("Desafiado: ");
      this.getDesafiado().apresentar();
      System.out.print("\nDesafiante: ");
      this.getDesafiante().apresentar();
      
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); //0,1 ou 2
      switch(vencedor) {
        case 0://Empate
          this.getDesafiado().empatarLuta();
          this.getDesafiante().empatarLuta();
          System.out.println("**************");
          System.out.println("Lutador desafiado: " + this.desafiado.getNome());
          System.out.println("Empates atuais: " + this.desafiado.getEmpates());
          System.out.println("Lutador desafiante: " + this.desafiante.getNome());
          System.out.println("Empates atuais: " + this.desafiante.getEmpates());
          System.out.println("**************");

            break;
        case 1: //Desafiado vence
          this.getDesafiado().ganharLuta();
          this.getDesafiante().perderLuta();
          System.out.println("*******LUTADOR DESAFIADO VENCE*******");
          System.out.println("Lutador desafiado: " + this.desafiado.getNome());
          System.out.println("Vitorias atuais: " + this.desafiado.getVitorias());
          System.out.println("Lutador desafiante: " + this.desafiante.getNome());
          System.out.println("Derrotas atuais: " + this.desafiante.getDerrotas());
          System.out.println("**************");

          break;
        case 2: //Desafiante vence
          this.getDesafiado().perderLuta();
          this.getDesafiante().ganharLuta();
          System.out.println("*******LUTADOR DESAFIANTE VENCE*******");
          System.out.println("Lutador desafiado: " + this.desafiado.getNome());
          System.out.println("Derrotas atuais: " + this.desafiado.getDerrotas());
          System.out.println("Lutador desafiante: " + this.desafiante.getNome());
          System.out.println("Vitorias atuais: " + this.desafiante.getDerrotas());
          System.out.println("**************");

          break;
      }
      
    }
    else {
      System.out.println("A luta não pode ocorrer");
    }
  }
}
