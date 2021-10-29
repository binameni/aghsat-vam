
package Harghest;

import javax.swing.JOptionPane;

class Harghest {


    public static void main(String[] args) {

        String l = JOptionPane.showInputDialog("mablagh vam :" );
        double L = Double.parseDouble(l);

        String r = JOptionPane.showInputDialog("sod :" );
        double R = Double.parseDouble(r);

        String n = JOptionPane.showInputDialog("Tedad ghest(SAL) :");
        int N = Integer.parseInt(n);

        double M = L*R/1-Math.pow(1/1+R, N)/12;
        String MP = String.valueOf(M);
        String msg = "har ghest :\n";

        JOptionPane.showMessageDialog (null, msg+MP , "har ghest" , JOptionPane . INFORMATION_MESSAGE );


    }

}
