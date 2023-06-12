package modul1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tugas1 extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        gd.setColor(Color.red);
        
//        Kotak
        gd.drawLine(50, 200, 50, 50);
        gd.drawLine(50, 50, 200, 50);
        gd.drawLine(200, 50, 200, 200);
        gd.drawLine(50, 200, 200, 200);
        
        gd.setColor(Color.blue);
//        Silang
        gd.drawLine(200, 200, 50, 50);
        gd.drawLine(200, 50, 50, 200);
        
        gd.setColor(Color.yellow);
//        Segitiga Bawah
        gd.drawLine(75, 190, 125, 140);
        gd.drawLine(125, 140, 175, 190);
        gd.drawLine(75, 190, 175, 190);
        
        gd.setColor(Color.orange);
//        Segitiga Atas
        gd.drawLine(75, 60, 125, 110);
        gd.drawLine(125, 110, 175, 60);
        gd.drawLine(75, 60, 175, 60);


    }
    
    public static void main(String[] args) {
        Tugas1 jp = new Tugas1();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 350);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum1 - Tugas 1 Grafika Komputer");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
