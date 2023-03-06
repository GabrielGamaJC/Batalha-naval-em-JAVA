/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batalhanaval;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class BatalhaNaval extends JFrame {

    private static boolean check = false;
    private static String nome;
    public static Grid mapa;
    public static List<JLabel> labelspc = new ArrayList<>();
    public static List<JLabel> labelshu = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        teste gui = new teste();
        gui.setVisible(true);
        labelspc = gui.getLabelspc();
        labelshu = gui.getLabelshu();

      //  mapa = new Grid();
     //   mapa.setLabelshu(labelshu);
     //   mapa.setLabelspc(labelspc);

        // TODO code application logic here
      //  Scanner ler = new Scanner(System.in);

     ///   System.out.println("Digite seu nome: ");
      //  nome = ler.nextLine();
       // ComputerPlayer pc = new ComputerPlayer();
       // pc.setmapa(mapa);
       // HumanPlayer hu = new HumanPlayer(nome);
      //  hu.setmapa(mapa);
      //  hu.setGui(gui);
      //  pc.setGui(gui);
      //  gui.setHuma(hu);
      //  gui.setComp(pc);

        // hu.setmapa(mapa);
        //while (check != true) {

         //   check = hu.takeTurn();
            //  input = hu.jogada;

          //  check = pc.takeTurn();
            //gui.setInput(input);

      //  }

        //game.setup();
        //game.start();
    }

    public BatalhaNaval() {

    }

}
