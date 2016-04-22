/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk0211;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Sean
 */
public class Huiswerk0211 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame frame = new Huiswerk0211();
        frame.setSize(300, 107);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Huiswerk opdracht 0211");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
}

class Paneel extends JPanel {

    private JButton knop1, knop2, knop3;
    private JTextField tekstvak;

    public Paneel() {
        knop1 = new JButton("Tekst 1");
        knop2 = new JButton("Tekst 2");
        knop3 = new JButton("Tekst 3");
        tekstvak = new JTextField(10);

        knop1.addActionListener(new Knop1Handler());
        knop2.addActionListener(new Knop2Handler());
        knop3.addActionListener(new Knop3Handler());

        add(knop1);
        add(knop2);
        add(knop3);
        add(tekstvak);
    }

    class Knop1Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Eerste tekst");
        }
    }

    class Knop2Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Tweede tekst");
        }
    }

    class Knop3Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Derde tekst");
        }
    }

}
