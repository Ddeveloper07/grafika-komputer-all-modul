package modul1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tugas2 extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        gd.setColor(Color.red);
        
//        Kotak
        gd.fillRect(175, 160, 300, 300);


    }
    
    public static void main(String[] args) {
        Tugas2 jp = new Tugas2();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 650);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum1 - Tugas 2 Grafika Komputer");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
