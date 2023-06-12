package modul3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetodeLineEquation extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        Scanner scanner = new Scanner(System.in);
        
        //        menggambar garis dengan bresenham
        Graphics2D gd = (Graphics2D) g;
        
        gd.setColor(Color.red);
        
        int x1=50,x2=200,y1=50,y2=200,x=x1,y=y1;
        double m=(y2-y1)/(x2-x1);
        double b=y1-(m*x1);
        double h=0;
        
        while (x<=x2) {
            h=(m*x)+b;
            y=(int)h;
            g.drawLine(x, y, x, y);
            x++;
        }
        
    }

    
    
    public static void main(String[] args) {
        MetodeLineEquation jp = new MetodeLineEquation();
        JFrame jf = new JFrame();
        
        jf.setSize(650, 350);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum3 - Metode Line Equation");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
