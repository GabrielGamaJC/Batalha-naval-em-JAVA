package batalhanaval;

import java.util.List;
// Definir classe DotCom
public abstract class DotCom {
  private List<String> locationCells;
  public String name;

    public List<String> getLocationCells() {
        return locationCells;
    }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setLocationCells(List<String> cells) {
    this.locationCells = cells; 
  }

  public String checkYourself(String guess) {
    String resultdot = "miss";
    for(String p : locationCells) {
      if (p.equals(guess)) {
        resultdot = "hit";
        break;
      }
    }
    if (resultdot == "hit") {
      locationCells.remove(guess);
    }
    if (locationCells.isEmpty()) {
      resultdot = "kill";
    }
    if (resultdot == "hit") {
        System.out.println(hitMessage());
    } else if (resultdot == "kill") {
        System.out.println(killMessage());
    }
    return resultdot;
  }
  
  public String hitMessage() {
  return "Acertou " + getName() + "!";
}

public String killMessage() {
  return "Matou " + getName() + "!";
}

  }


/*
public String checkYourself(ActionEvent e) {
    // Obter o botão que foi pressionado
    JButton button = (JButton) e.getSource();
    // Obter o texto do botão (que representa a posição)
    String guess = button.getText();
    String resultdot = "miss";
    for(String p : locationCells) {
      if (p.equals(guess)) {
        resultdot = "hit";
        break;
      }
    }
    if (resultdot == "hit") {
      locationCells.remove(guess);
    }
    if (locationCells.isEmpty()) {
      resultdot = "kill";
    }
    if (resultdot == "hit") {
        System.out.println(hitMessage());
    } else if (resultdot == "kill") {
        System.out.println(killMessage());
    }
    return resultdot;
  }

*/
// Inserir atributos que permitam localizar e nomear uma DotCom
// Inserir métodos de acesso e alteração dos atributos
// Atentar para os modificadores de visibilidade
// Inserir um método que permita verificar uma jogada
