package batalhanaval;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class MicroCom extends DotCom{
    public String contratantes;
    private List<String> locationCells;
    private String name;
    private int ataque;

    public void setName(String name) {
        this.name = name;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setContratantes(String contratantes) {
        this.contratantes = contratantes;
    }
    
    
      @Override
 public String hitMessage() {
     ataque--;
  return "Acertou " + name + ",POR FAVOR NAO ME ATIRE DENOVO, PERDEREI  CONTRATO COM O " + contratantes+"\nAtaques restantes para cancelar contrato: "+ataque;
}
 @Override   
 public String killMessage() {
  return "Matou " + name + "\nPerdido contrato com o "+contratantes;
}

    
}
