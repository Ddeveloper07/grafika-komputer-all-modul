package uts;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Uts1 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        Graphics2D gd = (Graphics2D) g;
        
        int r=200, x=0, y=0, x0=0, y0=0;
        
        x0=getWidth()/2;
        y0=getHeight()/2;
        
        gd.setStroke(new BasicStroke(5));
        for (int i=0;i<=1000;i++){
            gd.setColor(Color.black);
            x=(int)((Math.cos((int)i)*r)+x0);
            y=(int)((Math.sin((int)i)*r)+y0);
            gd.drawLine(x, y, x, y);
            
            gd.setColor(Color.red);
            gd.drawLine(x0 + x, y0 + y, x0 + x, y0 + y);
            gd.drawLine(x0 + x, y0 - y, x0 + x, y0 - y);
            gd.drawLine(x0 + x, y0 - y, x0 + x, y0 - y);
            gd.drawLine(x0 + x, y0 + y, x0 + x, y0 + y);
            gd.drawLine(x0 - y, y0 - x, x0 - y, y0 - x);
            gd.drawLine(x0 - y, y0 + x, x0 - y, y0 + x);
            gd.drawLine(x0 - y, y0 + x, x0 - y, y0 + x);
            gd.drawLine(x0 - y, y0 - x, x0 - y, y0 - x);
        }
        
//        Membuat Bintang
        gd.setColor(Color.red);
        gd.drawLine(155, 140, 475, 365);
        gd.drawLine(155, 140, 300, 477);
        gd.drawLine(475, 365, 115, 365);
        gd.drawLine(300, 477, 435, 140);
        gd.drawLine(435, 140, 115, 365);

    }

    

    public static void main(String[] args) {
        Uts1 jp = new Uts1();
        JFrame jf = new JFrame();
        
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
//        jf.setVisible(true);
        jf.setTitle("UTS");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
