package modul5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Modul5 extends JPanel{



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        
        int x0 = getWidth() / 2;
        int y0 = getHeight() / 2;
        int r = 250;
        int x = 0;
        int y = r;
        int d = 3-2*r;
        
        while (x <= y) {
            gd.drawLine(x0 + x, y0 + y, x0 + x, y0 + y);
            gd.drawLine(x0 - x, y0 + y, x0 - x, y0 + y);
            gd.drawLine(x0 + x, y0 - y, x0 + x, y0 - y);
            gd.drawLine(x0 - x, y0 - y, x0 - x, y0 - y);
            gd.drawLine(x0 + y, y0 + x, x0 + y, y0 + x);
            gd.drawLine(x0 - y, y0 + x, x0 - y, y0 + x);
            gd.drawLine(x0 + y, y0 - x, x0 + y, y0 - x);
            gd.drawLine(x0 - y, y0 - x, x0 - y, y0 - x);
            if (d < 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }
    
    
    
    public static void main(String[] args) {
        Modul5 jp = new Modul5();
        JFrame jf = new JFrame();
        
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Modul 5");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
