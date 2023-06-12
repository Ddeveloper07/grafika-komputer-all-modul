package uts;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Uts2 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

         // Set background color
        setBackground(Color.WHITE);

        // Draw head
        g.setColor(Color.BLACK);
        g.fillOval(80, 80, 180, 180);

        // Draw ears
        g.setColor(Color.WHITE);
        g.fillOval(100, 100, 50, 50);
        g.fillOval(200, 100, 50, 50);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 50, 50);
        g.drawOval(200, 100, 50, 50);

        // Draw eyes
        g.setColor(Color.WHITE);
        g.fillOval(130, 150, 30, 30);
        g.fillOval(210, 150, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(130, 150, 30, 30);
        g.drawOval(210, 150, 30, 30);
        g.setColor(Color.BLACK);
        g.fillOval(138, 158, 15, 15);
        g.fillOval(218, 158, 15, 15);

        // Draw nose
        g.setColor(Color.BLACK);
        g.fillOval(165, 185, 20, 25);

        // Draw mouth
        g.setColor(Color.BLACK);
        g.drawArc(150, 190, 60, 60, 45, 90);

        // Draw body
        g.setColor(Color.BLACK);
        g.fillOval(110, 230, 150, 150);

        // Draw arms
        g.setColor(Color.WHITE);
        g.fillOval(60, 230, 100, 100);
        g.fillOval(220, 230, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(60, 230, 100, 100);
        g.drawOval(220, 230, 100, 100);

        // Draw legs
        g.setColor(Color.WHITE);
        g.fillOval(110, 340, 50, 80);
        g.fillOval(190, 340, 50, 80);
        g.setColor(Color.BLACK);
        g.drawOval(110, 340, 50, 80);
        g.drawOval(190, 340, 50, 80);

        // Draw feet
        g.setColor(Color.BLACK);
        g.fillOval(115, 390, 40, 20);
        g.fillOval(195, 390, 40, 20);

        // Draw bamboo
        g.setColor(Color.GREEN);
        g.fillRect(0, 350, 80, 150);
        g.setColor(Color.BLACK);
        g.drawRect(0, 350, 80, 150);
        g.fillOval(60, 470, 40, 20);
        
    }

    
    public static void main(String[] args) {
        Uts2 jp = new Uts2();
        JFrame jf = new JFrame();
        
        jf.add(jp);
        jf.setSize(350, 500);
        jf.setVisible(true);
        jf.setTitle("UTS");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
