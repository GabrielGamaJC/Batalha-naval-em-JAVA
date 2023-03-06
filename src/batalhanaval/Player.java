/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author facom
 */
public abstract class Player{

   
    private String name;
    
      protected int count = 0;
      protected boolean verifica;
    public Grid mapa;

    public int getCount() {
        return count;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean takeTurn()
    { 
      //  mapa = new Grid();
       // mapa.setup();
        
    System.out.printf("VEZ DE "+getName()+" Jogar.");
  //  do {
      String jogada  = mapa.getUserInput("\nInforme a jogada:");
       mapa.verificarjogadapc(jogada);
       verifica = mapa.CheckList();
      count++;
      
      //g
     if(verifica == true){
          finishGame();
          return true;
     }
     else{return false;}
  //  } while (verifica != true);
   
       
    
    }
    

    
    
    public void finishGame() {
    System.out.printf("Jogo terminado apos %d jogadas.\n", count);
    JOptionPane.showMessageDialog(null, "Parabens você foi o vencedor: "+getName(), "Ganhador", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
    
   
    
    
}
