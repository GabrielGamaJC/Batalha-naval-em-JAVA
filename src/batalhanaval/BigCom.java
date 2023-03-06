/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

/**
 *
 * @author gabri
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BigCom extends DotCom{
    
      List<String> filiais = new ArrayList<>();
    private Random rand = new Random();
    private int index;
    private String sorteado;
    private int ataque = 0;
    public BigCom() {
        filiais.add("Empresa J");
        filiais.add("Empresa G");
        filiais.add("Empresa C");
    }
    @Override
     public String hitMessage() {
         ataque++;
  if(ataque == 2 || ataque == 4 ){
        index = rand.nextInt(filiais.size());
        sorteado = filiais.get(index);
        return "Acertou " + name + "\nPerdido contrato com " + sorteado;
       // empresas.remove(index);
  }
        return "Acertou " + name;
    }
    
      public String killMessage() {
        ataque = 6;
        if(ataque == 6){
        index = rand.nextInt(filiais.size());
        sorteado = filiais.get(index);
        filiais.remove(index);
        return "Matou " + name + "\nPerdido contrato com " + sorteado;
        
        }
         return "Matou " + name + "\nPerdido contrato com " + sorteado;
        }
     
   /*  
    @Override
    public String killMessage() {
         ataque++;
        if(ataque == 6){
        index = rand.nextInt(filiais.size());
        sorteado = filiais.get(index);
        filiais.remove(index);
        return "Matou " + name + "\nPerdido contrato com " + sorteado;
        }
        else{
            return "Matou " + name;
        }
}
*/
}