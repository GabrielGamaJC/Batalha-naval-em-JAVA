/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author facom
 */
public class Grid {

    private static final String alphabet = "abcdefghij";
    private int gridLength = 10;
    private int gridSize = 100;
    private int[] grid = new int[gridSize];
    private int comCount = 0;
    private List<JLabel> labelspc;
    private List<JLabel> labelshu;

    public void setLabelspc(List<JLabel> labelspc) {
        this.labelspc = labelspc;
    }

    public void setLabelshu(List<JLabel> labelshu) {
        this.labelshu = labelshu;
    }
    private StartupCom startup;
    private MicroCom micro;
    private JustAnotherCom just;
    private BigCom big;
    private List<DotCom> dotcomspc;
    private List<DotCom> dotcomshu;
    private List<String> barcoshu;
    public List<String> s;
    private String input;
    public List<String> m;
    public List<String> j;
    public List<String> b;
    private String posipc;

    public String getS() {
        String joinedString = String.join(", ", s);
        return joinedString;
    }

    public String getM() {
        String joinedString = String.join(", ", m);
        return joinedString;
    }

    public String getJ() {
        String joinedString = String.join(", ", j);
        return joinedString;
    }

    public String getB() {
        String joinedString = String.join(", ", b);
        return joinedString;
    }

    public void setInput(String input) {
        this.input = input;
    }

    private StartupCom buildStartupCom(String name) {
        startup = new StartupCom();
        startup.setName(name);
        s = placeDotCom(startup.getNUM_POSITIONS());
        startup.setLocationCells(s);
        //System.out.print(s);
        return startup;
    }

    private MicroCom buildMicroCom(String contrato, String name) {
        micro = new MicroCom();
        micro.setContratantes(contrato);
        micro.setName(name);
        micro.setAtaque(4);
        m = placeDotCom(4);
        micro.setLocationCells(m);
        //System.out.print(m);
        return micro;
    }

    private JustAnotherCom buildJustAnother(String name) {
        just = new JustAnotherCom();
        just.setName(name);
        j = placeDotCom(5);
        just.setLocationCells(j);
        //  System.out.print(j);
        return just;
    }

    private BigCom buildBigCom(String name) {
        big = new BigCom();
        big.setName(name);
        b = placeDotCom(6);
        big.setLocationCells(j);
        // System.out.print(j);
        // gui.addPositions(j);
        return big;
    }

    private StartupCom buildStartupComHuman(String name) {
        startup = new StartupCom();
        startup.setName(name);
        JOptionPane.showMessageDialog(null, "Adicione 3 posições para primeiro navio(Uma por vez).", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        s = adicionaPosicoes(startup.getNUM_POSITIONS());
        startup.setLocationCells(s);
        System.out.print(s);
        JOptionPane.showMessageDialog(null, "Navio adicionado.", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);
        return startup;
    }

    private MicroCom buildMicroComHuman(String contrato, String name) {
        micro = new MicroCom();
        micro.setContratantes(contrato);
        micro.setName(name);
        micro.setAtaque(4);
        JOptionPane.showMessageDialog(null, "Adicione 4 posições para primeiro navio(Uma por vez).", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        m = adicionaPosicoes(4);
        micro.setLocationCells(m);
        // System.out.print(m);
        JOptionPane.showMessageDialog(null, "Navio adicionado.", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        return micro;
    }

    private JustAnotherCom buildJustAnotherHuman(String name) {
        just = new JustAnotherCom();
        just.setName(name);
        JOptionPane.showMessageDialog(null, "Adicione 5 posições para primeiro navio(Uma por vez).", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        j = adicionaPosicoes(5);
        just.setLocationCells(j);
        // System.out.print(j);
        JOptionPane.showMessageDialog(null, "Navio adicionado.", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        return just;
    }

    private BigCom buildBigComHuman(String name) {
        big = new BigCom();
        big.setName(name);
        JOptionPane.showMessageDialog(null, "Adicione 6 posições para primeiro navio(Uma por vez).", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        b = adicionaPosicoes(6);
        big.setLocationCells(b);
        JOptionPane.showMessageDialog(null, "Navio adicionado.", "Adicionar navio", JOptionPane.INFORMATION_MESSAGE);

        // System.out.print(b);
        // gui.addPositions(j);
        return big;
    }

    public void setup() {
        dotcomspc = new ArrayList<DotCom>();

        //dotcoms.add(buildDotCom("Pets.com"));
        // dotcoms.add(buildDotCom("Xyz.com"));
        // dotcoms.add(buildDotCom("Cats.com"));
        // dotcoms.add(buildDotCom("Cats2.com"));
        dotcomspc.add(buildStartupCom("StartupCom 1"));
        //dotcoms.add(buildStartupCom("StartupCom 2"));
        // dotcoms.add(buildStartupCom("StartupCom 3"));
        // dotcoms.add(buildStartupCom("StartupCom 4"));
        // dotcoms.add(buildMicroCom("Google", "MicroCom 1"));
        dotcomspc.add(buildMicroCom("Facebook", "MicroCom 2"));
        //  dotcoms.add(buildMicroCom("Instagram","MicroCom 3"));
        //  dotcoms.add(buildMicroCom("Github","MicroCom 4"));
        dotcomspc.add(buildJustAnother("JustAnotherCom 1"));
        // dotcoms.add(buildJustAnother("JustAnotherCom 2"));
        dotcomspc.add(buildBigCom("BigCom 1"));
        // justA.add(buildJustAnother("JustAnotherCom 3"));
        // justA.add(buildJustAnother("JustAnotherCom 4"));
    }

    public void setupHuman() {
        dotcomshu = new ArrayList<DotCom>();
        //  dotcoms = new ArrayList<DotCom>();
        //dotcoms.add(buildDotCom("Pets.com"));
        // dotcoms.add(buildDotCom("Xyz.com"));
        // dotcoms.add(buildDotCom("Cats.com"));
        // dotcoms.add(buildDotCom("Cats2.com"));
        dotcomshu.add(buildStartupComHuman("StartupCom Humano"));
        // dotcoms.add(buildStartupComHuman("StartupCom 2"));
        //  dotcoms.add(buildStartupComHuman("StartupCom 3"));
        //  dotcoms.add(buildStartupComHuman("StartupCom 4 hum"));
        dotcomshu.add(buildMicroComHuman("Google", "MicroCom 1"));
        // dotcoms.add(buildMicroComHuman("Facebook","MicroCom 2"));
        // dotcoms.add(buildMicroComHuman("Instagram","MicroCom 3"));
        // dotcoms.add(buildMicroComHuman("Github","MicroCom 4"));
        dotcomshu.add(buildJustAnotherHuman("JustAnotherCom 1"));
        // dotcoms.add(buildJustAnotherHuman("JustAnotherCom 2"));
        dotcomshu.add(buildBigComHuman("BigCom 1"));
        // justA.add(buildJustAnother("JustAnotherCom 3"));
        // justA.add(buildJustAnother("JustAnotherCom 4"));
    }

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {

        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];      // holds 'f6' type coords
        String temp = null;                                // temporary String for concat
        int[] coords = new int[comSize];                  // current candidate coords
        int attempts = 0;                                  // current attempts counter
        boolean success = false;                           // flag = found a good location ?
        int location = 0;                                  // current starting location

        comCount++;                                        // nth dot com to place
        int incr = 1;                                      // set horizontal increment
        if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
            incr = gridLength;                               // set vertical increment
        }

        while (!success & attempts++ < 200) {             // main search loop  (32)
            location = (int) (Math.random() * gridSize);
            Random gerador = new Random();
            int resultado = gerador.nextInt(100);// get random starting point

            //System.out.print(" try " + location);
            int x = 0;                                        // nth position in dotcom to place
            success = true;
            // assume success
            while (success && x < comSize) {                // look for adjacent unused spots
                if (grid[location] == 0) {                    // if not already used
                    coords[x++] = location;                    // save location
                    location += incr;                          // try 'next' adjacent
                    if (location >= gridSize) {                 // out of bounds - 'bottom'
                        success = false;                         // failure
                    }
                    if (x > 0 & (location % gridLength == 0)) {  // out of bounds - right edge
                        success = false;                         // failure
                    }
                } else {                                      // found already used location
                    // System.out.print(" used " + location);  
                    success = false;                          // failure
                }
            }
        }                                                   // end while

        int x = 0;                                          // turn good location into alpha coords
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
            row = (int) (coords[x] / gridLength);             // get row value
            column = coords[x] % gridLength;                  // get numeric column value
            temp = String.valueOf(alphabet.charAt(column));   // convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            posipc = posipc + temp.concat(Integer.toString(row));
            // System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
        }
        // System.out.println("\n");

        return alphaCells;
    }
    private String posi;

    public ArrayList<String> adicionaPosicoes(int tamanhoMaximo) {
        ArrayList<String> navios = new ArrayList<String>();
        int tamanhoAtual = 0;
        int ultimaLinha = -1;
        int ultimaColuna = -1;
        while (tamanhoAtual < tamanhoMaximo) {
            String input = JOptionPane.showInputDialog(null, "Insira as coordenadas para o navio (ex: a0) ou digite 'sair' para terminar: ", "Coordenadas navio", JOptionPane.INFORMATION_MESSAGE);
            if (input.equals("sair")) {
                break;
            }
            if (navios.contains(input)) {
                //System.out.println("Essa posicao já foi adicionada, tente novamente.");
                JOptionPane.showMessageDialog(null, "Essa posicao já foi adicionada, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            if (input.length() != 2) {
                //System.out.println("Entrada invalida, tente novamente.");
                JOptionPane.showMessageDialog(null, "Entrada invalida, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            int row = Integer.parseInt(input.substring(1));
            int col = -1;
            if (alphabet.indexOf(input.charAt(0)) != -1) {
                col = alphabet.indexOf(input.charAt(0));
            } else {
                // System.out.println("A letra nao esta dentro das letras predefinidas, tente novamente.");
                JOptionPane.showMessageDialog(null, "A letra nao esta dentro das letras predefinidas, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (navios.size() > 0) {
                if (col == ultimaColuna) {
                    if (row != ultimaLinha + 1) {
                        //System.out.println("As posicoes devem ser consecutivas na mesma coluna, tente novamente.");
                        JOptionPane.showMessageDialog(null, "As posicoes devem ser consecutivas na mesma coluna, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);

                        continue;
                    }
                } else if (row == ultimaLinha) {
                    if (col != ultimaColuna + 1) {
                        // System.out.println("As posicoes devem ser consecutivas na mesma linha, tente novamente.");
                        JOptionPane.showMessageDialog(null, "As posicoes devem ser consecutivas na mesma linha, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);

                        continue;
                    }
                } else {
                    System.out.println("As posicoes devem ser consecutivas na mesma linha ou coluna, tente novamente.");
                    JOptionPane.showMessageDialog(null, "As posicoes devem ser consecutivas na mesma linha ou coluna, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);

                    continue;
                }
            }
            ultimaLinha = row;
            ultimaColuna = col;
            int location = row * gridLength + col;
            if (location < 0 || location >= gridSize) {
                //  System.out.println("Coordenadas fora dos limites do grid, tente novamente.");
                JOptionPane.showMessageDialog(null, "Coordenadas fora dos limites do grid, tente novamente.", "Posição gerada", JOptionPane.INFORMATION_MESSAGE);

                continue;
            }
            navios.add(input);
            posi = posi + "," + input;

            tamanhoAtual++;
        }
        return navios;
    }

    public String getPosi() {
        return posi;
    }

    public String getPosipc() {
        return posipc;
    }

    /*
    public void mostrarPosi() {
        System.out.println(s);
        System.out.println(j);
        System.out.println(b);
        System.out.println(m);
    }
     */
    private String jogadahu;

    public void verificarjogadahu(String jogada) {

        String resultDot = "miss";
        DotCom hitted = null;
        for (DotCom dotcom : dotcomspc) {
            resultDot = dotcom.checkYourself(jogada);
            if (resultDot != "miss") {
                jogadahu = "hit";
                counthu++;
                atualizagridpc(jogada, jogadahu);
                hitted = dotcom;
                break;
            }
        }
        if (resultDot == "kill") {
            dotcomspc.remove(hitted);
            jogadahu = "kill";
            counthu++;
            atualizagridpc(jogada, jogadahu);
        }
        if (resultDot != "kill" && resultDot != "hit") {
            System.out.println("miss");
            //JOptionPane.showMessageDialog(null, "Sua mensagem aqui", "Título da caixa de mensagem", JOptionPane.INFORMATION_MESSAGE);
            jogadahu = "miss";
            counthu++;
            atualizagridpc(jogada, jogadahu);
        }
        //if(dotcoms.isEmpty())
        //  return true;
        //  return false;

    }

    private String jogadapc;

    public String getJogadahu() {
        return jogadahu;
    }

    public String getJogadapc() {
        return jogadapc;
    }

    public void verificarjogadapc(String jogada) {

        String resultDot = "miss";
        DotCom hitted = null;
        for (DotCom dotcom : dotcomshu) {
            resultDot = dotcom.checkYourself(jogada);
            if (resultDot != "miss") {
                jogadapc = "hit";
                countpc++;
                hitted = dotcom;
                atualizagridhu(jogada, jogadapc);
                break;

            }
        }

        if (resultDot == "kill") {
            jogadapc = "kill";
            countpc++;
            atualizagridhu(jogada, jogadapc);
            dotcomshu.remove(hitted);
        }
        if (resultDot != "kill" && resultDot != "hit") {
            jogadapc = "miss";
            countpc++;
            atualizagridhu(jogada, jogadapc);
            System.out.println("miss");
        }
        //if(dotcoms.isEmpty())
        //  return true;
        //  return false;

    }

    public void atualizagridhu(String tentativa, String resultado) {

        for (JLabel label : labelshu) {
            if (resultado == "hit") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/anchor.png")));

                    break;
                }
            } else if (resultado == "kill") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/anchor.png")));

                    break;
                }

            } else if (resultado == "miss") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/cancel.png")));

                    break;
                }
            }

        }
    }

    public void atualizagridpc(String tentativa, String resultado) {

        for (JLabel label : labelspc) {
            if (resultado == "hit") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/anchor.png")));

                    break;
                }
            } else if (resultado == "kill") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/anchor.png")));

                    break;
                }

            } else if (resultado == "miss") {
                if (label.getText().equals(tentativa)) {
                    label.setText("");

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/cancel.png")));

                    break;
                }
            }

        }
    }

    private int countpc;
    private int counthu;

    public String getCountpc() {
        return Integer.toString(countpc);
    }

    public String getCounthu() {
        return Integer.toString(counthu);
    }

    public boolean CheckList() {
        if (dotcomshu.isEmpty()) {
            return true;
        } else if (dotcomspc.isEmpty()) {
            return true;
        } else {
            return false;

        }
    }

    public Grid() {
        //setupHuman();
        //setup();
    }

}
