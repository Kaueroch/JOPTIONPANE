
package javaapplication3;

import javax.swing.JOptionPane;



public class JavaApplication3 {

    public static void main(String[] args) {
      double n1,n2,n3;
      n1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o 1 numero"));
      n2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o 1 numero"));
      n3 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o 1 numero"));
      double m = (n1+ n2+n3)/3;
        JOptionPane.showMessageDialog(null, "MEDIA CANALHA" + String.format("%.2f" , m) );
    } 
}
