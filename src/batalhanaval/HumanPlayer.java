/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

import java.util.List;

/**
 *
 * @author facom
 */
public class HumanPlayer extends Player {

    private Grid human;
    private String name;
    private teste gui;

    public void setGui(teste gui) {
        this.gui = gui;
    }
    private List<String> locationCells;

    public List<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(List<String> locationCells) {
        this.locationCells = locationCells;
    }
    
     public void setmapa(Grid grid)
         {
         this.human = grid;
         human.setupHuman();
         }

    public HumanPlayer(String name) {
       // mapa = new Grid();
        this.name = name;
        //  mapa.placeDotComHuman(4);
        //   mapa.placeDotComHuman(5);

    }

   

     public boolean takeTurn(String jogada)
    { 
      //  mapa = new Grid();
       // mapa.setup();
       // human.setupHuman();
        
    System.out.printf("VEZ DE "+getName()+" Jogar.");
  //  do {
     // String jogada  = human.getUserInput("\nInforme a jogada:");
    // gui.setInput(jogada);
       human.verificarjogadahu(jogada);
       verifica = human.CheckList();
       count++;
      
      //g
     if(verifica == true){
          finishGame();
          return true;
     }
     else{return false;}
  //  } while (verifica != true);
   
       
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
