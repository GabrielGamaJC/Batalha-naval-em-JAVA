package batalhanaval;


import helper.GameHelper;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.Random;
// Declarar classe DotComBust, responsável pela lógica do jogo
public class DotComBust {
  // Inserir atributos para armazenar as DotCom's
  private GameHelper helper;
  private StartupCom startup;
  private MicroCom micro;
  private JustAnotherCom just;
  private BigCom big;
   
 // private DotCom dotcom;
  private List<DotCom> dotcoms;
  private int count;
   private StartupCom buildStartupCom(String name) {
     startup = new StartupCom();
    startup.setName(name);
    List<String> s = helper.placeDotCom(startup.getNUM_POSITIONS());
    startup.setLocationCells(s);
    System.out.print(s);
    //gui.addPositions(s);
    return startup;
  }
    private MicroCom buildMicroCom(String contrato,String name) {
     micro = new MicroCom();
     micro.setContratantes(contrato);
     micro.setName(name);
     micro.setAtaque(4);
    List<String> m = helper.placeDotCom(4);
    micro.setLocationCells(m);
    System.out.print(m);
   // gui.addPositions(m);
    return micro;
  }
     private JustAnotherCom buildJustAnother(String name) {
     just = new JustAnotherCom();
     just.setName(name);
    List<String> j = helper.placeDotCom(5);
    just.setLocationCells(j);
    System.out.print(j);
   // gui.addPositions(j);
    return just;
  }
     private BigCom buildBigCom(String name) {
     big = new BigCom();
     big.setName(name);
    List<String> j = helper.placeDotCom(6);
    big.setLocationCells(j);
    System.out.print(j);
   // gui.addPositions(j);
    return big;
  }
  // Inserir o método para preparar o jogo, criar e nomear as DotCom's e posicionar no campo de batalha
  public void setup() {
    
    helper = new GameHelper();
    dotcoms = new ArrayList<DotCom>();
    dotcoms.add(buildStartupCom("StartupCom 1"));
    dotcoms.add(buildStartupCom("StartupCom 2"));
    dotcoms.add(buildStartupCom("StartupCom 3"));
    dotcoms.add(buildStartupCom("StartupCom 4"));
    dotcoms.add(buildMicroCom("Google","MicroCom 1"));
    dotcoms.add(buildMicroCom("Facebook","MicroCom 2"));
    dotcoms.add(buildMicroCom("Instagram","MicroCom 3"));
    dotcoms.add(buildMicroCom("Github","MicroCom 4"));
    dotcoms.add(buildJustAnother("JustAnotherCom 1"));
    dotcoms.add(buildJustAnother("JustAnotherCom 2"));
     
    dotcoms.add(buildBigCom("BigCom 1"));
    count = 0;
  }
  

  // Inserir o método para iniciar o jogo, apresentar as regras, receber as jogadas do usuário, processar e informar o resultado de cada jogada, apresentar os resultados finais
  public void start() {
    System.out.printf("Objetivos do jogo...\n");
    do {
      String jogada  = helper.getUserInput("\nInforme a jogada:");
      count++;
      String resultDot = "miss";
      DotCom hitted = null;
      for(DotCom dotcom : dotcoms) {
        resultDot = dotcom.checkYourself(jogada);
       // System.out.print(result);    
        if (resultDot != "miss") {
          hitted = dotcom;
          break;
        }
      }
       if (resultDot == "kill") {
        dotcoms.remove(hitted);
      }
      if (resultDot != "kill" && resultDot != "hit") {
        System.out.println("miss");
    }
    } while (!dotcoms.isEmpty());
    finishGame();
  }
// Inserir o método para apresentar os resultados do jogo  
  public void finishGame() {
    System.out.printf("Jogo terminado após %d jogadas.\n", count);
  }
}


