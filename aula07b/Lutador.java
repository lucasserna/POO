
package aula07b;

/*
 * @author lucas.serna
 */
public class Lutador {
  private String nome;
  private String nacionalidade;
  private int idade;
  private double altura;
  private double peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;
  
    //metodos especiais
  public Lutador(String nome, String nacio, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
    this.setNome(nome);
    this.setNacionalidade(nacio);
    this.setIdade(idade);
    this.setAltura(altura);
    this.setPeso(peso);
    this.setVitorias(vitorias);
    this.setEmpates(empates);
    this.setDerrotas(derrotas);
}
  public String getNome(){
    return nome;
  }
  public void setNome(String nome) {
    nome = nome.substring(0,1).toUpperCase()+nome.substring(1,nome.length()).toLowerCase();
    if(nome=="Eua" || nome=="Usa") {
      nome = nome.toUpperCase();
    }
    this.nome = nome;
  }
  public String getNacionalidade(){
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade.substring(0,1).toUpperCase()+nacionalidade.substring(1,nacionalidade.length()).toLowerCase();
  }
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade=idade;
  }
  public double getAltura(){
    return altura;
  }
  public void setAltura(double altura){
   this.altura = altura; 
  }
  
  public double getPeso(){
    return peso;
  }
  public void setPeso(double peso){
    this.peso=peso;
    this.setCategoria(peso);
  }
  public String getCategoria(){
    return categoria;
  }
  public void setCategoria(double categoria){
    if (this.getPeso()>52.2 && this.getPeso()<=70.3) 
      this.categoria = "Leve";
    else if(this.getPeso()<=83.9) 
      this.categoria = "Medio";
    else if (this.getPeso()<= 120)
      this.categoria = "Pesado";
    else 
      this.categoria = "Invalido";
    // se peso<52.2 categoria invalido
    // peso<=70.3 categoria leve
    // peso<= 83.9 categoria medio
    // peso<= 120.2 categoria pesado
    // senao invalido
  }
  public int getVitorias(){
    return vitorias;
  }
  public void setVitorias(int vitorias){
    this.vitorias = vitorias;
  }
  public int getDerrotas(){
    return derrotas;
  }
  public void setDerrotas(int derrotas){
    this.derrotas = derrotas;
  }
  public int getEmpates(){
    return empates;
  }
  public void setEmpates(int empates){
    this.empates = empates;
  }
    //metodos Publicos
 public void apresentar(){
   System.out.println("Vem ai o lutador: "+ this.getNome());
   System.out.println("De nacionalidade: "+this.getNacionalidade());
   System.out.println("Com "+this.getIdade()+" de idade");
   System.out.println("Com altura: " + this.getAltura());
   System.out.println("Peso: "+ this.getPeso());
   System.out.println("Na categoria: "+this.getCategoria());
   if(this.getDerrotas()==0 && (this.getVitorias()!=0||this.getEmpates()!=0)) 
     System.out.println("Invicto, com " + this.getVitorias()+" vitorias e "+ this.getEmpates()+ " empates.");
   else System.out.println("Com " + this.getVitorias()+" vitorias, "+ this.getDerrotas() + " derrotas e "+this.getEmpates()+" empates.");
   System.out.println("_________________________");
 }
  public void status(){
   
 }
   
public void ganharLuta(){
  this.setVitorias(this.getVitorias()+1);
} 
public void perderLuta(){
  this.setDerrotas(this.getDerrotas()+1);
  }
public void empatarLuta(){
  this.setEmpates(this.getEmpates()+1);
  
}
}


