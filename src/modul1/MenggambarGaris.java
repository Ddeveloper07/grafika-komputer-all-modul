package modul1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenggambarGaris extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        
//        Garis
        gd.drawLine(50, 200, 50, 50);

    }
    
    public static void main(String[] args) {
        MenggambarGaris jp = new MenggambarGaris();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 350);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum1 - Menggambar Garis");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
