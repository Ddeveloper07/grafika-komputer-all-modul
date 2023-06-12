package modul1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Latihan extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        gd.setColor(Color.red);
        
//        Kotak
        gd.drawLine(100, 100, 400, 100);
        gd.drawLine(100, 100, 100, 400);
        gd.drawLine(400, 100, 400, 400);
        gd.drawLine(100, 400, 400, 400);

    }
    
    public static void main(String[] args) {
        Latihan jp = new Latihan();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 350);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum1 - Latihan");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
