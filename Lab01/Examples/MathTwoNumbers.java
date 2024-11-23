// Ex5: MathTwoNumbers.java
import javax.swing.JOptionPane;
public class MathTwoNumbers{
  public static void main (String[] args){
    String strNum1, strNum2;
    String strNotification = "Sum, Diff, Product, Quotient in that order: ";
    
    strNum1 = JOptionPane.showInputDialog(null,
                                          "Please enter first number: ", "Input the first number",
                                          JOptionPane.INFORMATION_MESSAGE);
    double num1 = Double.parseDouble(strNum1);

    strNum2 = JOptionPane.showInputDialog(null,
                                          "Please enter second number: ", "Input the second number",
                                          JOptionPane.INFORMATION_MESSAGE);
    double num2 = Double.parseDouble(strNum2);

    double sum = num1 + num2;
    double diff = num1 - num2;
    double product = num1*num2;
    double quotient = num1/num2;

    JOptionPane.showMessageDialog(null, strNotification + sum + ", " + diff + ", " + product + ", " + quotient,
                                  "Math two numbers", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}