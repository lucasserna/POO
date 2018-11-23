package aula07b;

/*
 * @author lucas.serna
 */
public class Aula07b {
  public static void main(String[] args) {
    // TODO code application logic here
    Lutador l[] = new Lutador[6];
    l[0] = new Lutador("PRETTY BOY", "França", 31, 1.75f, 68.9f, 11, 2, 1);
    l[0].apresentar();
    
    l[1] = new Lutador("Putscript", "brasil", 29, 1.68f, 57.8f, 14, 2, 3);
    l[1].apresentar();
    
    l[2] = new Lutador("snapshadow", "eua", 35, 1.65, 80.9, 12, 2, 1);
    l[2].apresentar();
    
    l[3] = new Lutador("dead code", "australia", 28, 13, 81.6, 13, 0, 2);
    l[3].apresentar();
    
    l[4] = new Lutador("ufocobol", "brasil", 37, 1.70, 119.3, 5, 4, 3);
    l[4].apresentar();
    
    l[5] = new Lutador("nerdard", "eua", 30, 1.81, 105.7, 12, 2, 4);
    l[5].apresentar();
    
    
    
    Luta saporra1 = new Luta();
    saporra1.marcarLuta(l[0], l[1]);
    saporra1.Lutar();
  }
  
}
