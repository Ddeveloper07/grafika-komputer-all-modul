package uts;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UTS extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D gd = (Graphics2D) g;
        
        // background color
        gd.setColor(Color.WHITE);
        gd.fillRect(0, 0, getWidth(), getHeight());

        // head
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillOval(150, 100, 200, 200);
        gd.setColor(Color.BLUE);
        gd.drawOval(150, 100, 200, 200);

        // mask
        gd.setColor(new Color(48, 62, 87)); // dark blue
        gd.fillArc(160, 110, 180, 180, 45, 90); // left side
        gd.fillArc(160, 110, 180, 180, 135, 90); // right side
        gd.setColor(Color.BLUE);
        gd.drawArc(160, 110, 180, 180, 45, 90); // left side outline
        gd.drawArc(160, 110, 180, 180, 135, 90); // right side outline
        gd.drawLine(250, 200, 250, 250); // middle line
        
        // eyes
        gd.setColor(Color.WHITE);
        gd.fillOval(180, 140, 40, 40); // left eye
        gd.fillOval(280, 140, 40, 40); // right eye
        gd.setColor(Color.BLACK);
        gd.drawOval(180, 140, 40, 40); // left eye outline
        gd.drawOval(280, 140, 40, 40); // right eye outline
        gd.fillOval(200, 160, 10, 10); // left pupil
        gd.fillOval(300, 160, 10, 10); // right pupil

        // mouth
        gd.setColor(Color.BLACK);
        gd.drawLine(220, 220, 280, 220); // mouth

        // body
        gd.setColor(new Color(193, 38, 82)); // red
        gd.fillRect(220, 250, 60, 120); // upper body
        gd.setColor(Color.BLACK);
        gd.drawRect(220, 250, 60, 120); // upper body outline
        gd.fillRect(200, 370, 100, 30); // lower body
        gd.setColor(Color.WHITE);
        int[] xPoints = {200, 220, 300, 320};
        int[] yPoints = {370, 400, 400, 370};
        gd.fillPolygon(xPoints, yPoints, 2); // belt

        // arms
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillRect(120, 250, 100, 30); // left arm
        gd.setColor(Color.BLUE);
        gd.drawRect(120, 250, 100, 30); // left arm outline
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillRect(280, 250, 100, 30); // right arm
        gd.setColor(Color.blue);
        gd.drawRect(280, 250, 100, 30); // right arm outline
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillOval(110, 230, 40, 40); // left hand
        gd.setColor(Color.BLUE);
        gd.drawOval(110, 230, 40, 40); // left hand outline
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillOval(350, 230, 40, 40); // right hand
        gd.setColor(Color.BLUE);
        gd.drawOval(350, 230, 40, 40); // right hand outline

        // legs
        gd.setColor(new Color(193, 38, 82)); // red
        gd.fillRect(200, 400, 30, 100); // left leg
        gd.setColor(Color.BLACK);
        gd.drawRect(200, 400, 30, 100); // left leg outline
        gd.setColor(new Color(193, 38, 82)); // red
        gd.fillRect(270, 400, 30, 100); // right leg
        gd.setColor(Color.BLACK);
        gd.drawRect(270, 400, 30, 100); // right leg outline
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillOval(200, 500, 30, 20); // left foot
        gd.setColor(Color.BLACK);
        gd.drawOval(200, 500, 30, 20); // left foot outline
        gd.setColor(new Color(255, 205, 148)); // skin color
        gd.fillOval(270, 500, 30, 20); // right foot
        gd.setColor(Color.BLACK);
        gd.drawOval(270, 500, 30, 20); // right foot outline
    }
    
    
    public static void main(String[] args) {
    
        UTS jp = new UTS();
        JFrame jf = new JFrame();
        
        jf.add(jp);
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setTitle("UTS");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
