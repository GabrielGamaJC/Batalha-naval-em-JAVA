/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

import java.util.Set;

/**
 *
 * @author facom
 */
public class ComputerPlayer extends Player{
  private Grid pc;
  public String jogada;
  private teste gui;

    public void setGui(teste gui) {
        this.gui = gui;
    }
         public void setmapa(Grid grid)
         {
         this.pc = grid;
          pc.setup();
         }
private String name = "PC";


    public String getName() {
        return name;
    }
    
   
     public boolean takeTurn(String jogada)
    { 
      //  mapa = new Grid();
       // mapa.setup();
        //pc.setup();
        
    System.out.println("VEZ DE "+getName()+" Jogar.");
  //  do {
     // jogada  = pc.getUserInput("\nInforme a jogada:");
    // jogada = pc.getUserInput2();
       pc.verificarjogadapc(jogada);
       
       verifica = pc.CheckList();
      count++;
      
      //g
     if(verifica == true){
          finishGame();
          return true;
     }
     else{return false;}
  //  } while (verifica != true);
   
       
    
    }

   
    
    
    
    
    
}
