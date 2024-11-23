// Ex6: SolveEquation.java
import javax.swing.JOptionPane;
public class SolveEquation{
  public static void main (String[] args){
    String strChoice;
    String strNotification;

    strChoice = JOptionPane.showInputDialog(null,
                                            "Please enter number corresponds to the type of equation you want to solve" + "\n" +
                                            "    1. First-degree, one variable"                                         + "\n" +
                                            "    2. First-degree, two variables"                                        + "\n" +
                                            "    1. Second-degree, one variable", 
                                            "Choose equation type", JOptionPane.INFORMATION_MESSAGE);
    integer choice = Integer.parseInt(strChoice);
    switch(choice){
      case 1:
        JOptionPane.showMessageDialog(null,
                                      "You chose first-degree equation with one variable x:" + "\n" +
                                      "    ax + b = 0",
                                      "Math two numbers", JOptionPane.INFORMATION_MESSAGE);
    }  
  }
}
