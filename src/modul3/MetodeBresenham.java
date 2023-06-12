package modul3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetodeBresenham extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        Scanner scanner = new Scanner(System.in);
        
        //        menggambar garis dengan bresenham
        Graphics2D gd = (Graphics2D) g;
        
        gd.setColor(Color.red);
        
        int dx, dy, d1, d2, p, x, y;
        
        int x1=60,x2=120,y1=70,y2=140;
        
        dx = x2 - x1;
        dy = y2 - y1;
        d1 = 2 * dy;
        d2 = 2 * (dx-dy);
        p = d1 - dx;
        x = x1;
        y = y1;
        
        do {
            
            if (p >= 0) {
                p = p - d2;
                y = y + 1;
            }else {
                p = p + d1;
                y = y;
            }
            gd.drawLine(x, y, x2, y2);
            x++;
        }while (x >= x2); 
        
    }

    
    
    public static void main(String[] args) {
        MetodeBresenham jp = new MetodeBresenham();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 350);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum3 - Metode Bresenham");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
