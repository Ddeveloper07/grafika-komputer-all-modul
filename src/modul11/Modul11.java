package modul11;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Modul11 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D gd = (Graphics2D) g;
        
        Polygon pol;
        int x[] = {170, 200, 270, 300, 270, 200};
        int y[] = {150, 100, 100, 150, 200, 200};
        pol = new Polygon(x, y, x.length);
        gd.setPaint(Color.red);
        gd.fill(pol);
        gd.setColor(Color.BLACK);
        gd.drawPolygon(pol);
        
    
    }
    
    

    public static void main(String[] args) {
        Modul11 jp = new Modul11();
        JFrame jf = new JFrame();
        
        jf.setSize(500, 400);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Modul 9");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
