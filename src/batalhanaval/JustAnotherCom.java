/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gabri
 */
public class JustAnotherCom extends DotCom {

    //List<String> empresas = Arrays.asList("Empresa A", "Empresa B", "Empresa C", "Empresa D", "Empresa E");
    List<String> empresas = new ArrayList<>();
    private Random rand = new Random();
    private int index;
    private String sorteado;
    private Boolean removido = false;

    public JustAnotherCom() {
        empresas.add("Empresa A");
        empresas.add("Empresa B");
        empresas.add("Empresa C");
        empresas.add("Empresa D");
        empresas.add("Empresa E");
    }

    @Override
    public String hitMessage() {

        index = rand.nextInt(empresas.size());

        sorteado = empresas.get(index);
       // empresas.remove(index);

        return "Acertou " + name + "\nPerdido contrato com " + sorteado;
    }

    @Override
    public String killMessage() {
        index = rand.nextInt(empresas.size());
        sorteado = empresas.get(index);
        empresas.remove(index);
        return "Matou " + name + "\nPerdido contrato com " + sorteado;
    }
}
