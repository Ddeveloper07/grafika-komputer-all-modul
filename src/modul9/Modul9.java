package modul9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

public class Modul9 extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath gp = new GeneralPath();

        //--- Koordinat Objek 3 Dimensi
        int x1=80, y1=500-200, z1=0,x2=300, y2=500-200,
        z2=0, x3=300, y3=500-200, z3=300, x4=100,
        y4=500-200, z4=300, x5=60, y5=500-400, z5=250, 
        x6=225, y6=500-400, z6=250, x7=289, y7=550-400, 
        z7=325, x8=96, y8=550-400, z8=325;

        double E= 1000;

        double x12D=(int)(x1/(1-(z1/E)));
        double y12D=(int)(y1/(1-(z1/E)));
        double x22D=(int)(x2/(1-(z2/E)));
        double y22D=(int)(y2/(1-(z2/E)));
        double x32D=(int)(x3/(1-(z3/E)));
        double y32D=(int)(y3/(1-(z3/E)));
        double x42D=(int)(x4/(1-(z4/E)));
        double y42D=(int)(y4/(1-(z4/E)));
        double x52D=(int)(x5/(1-(z5/E)));
        double y52D=(int)(y5/(1-(z5/E)));
        double x62D=(int)(x6/(1-(z6/E)));
        double y62D=(int)(y6/(1-(z6/E)));
        double x72D=(int)(x7/(1-(z7/E)));
        double y72D=(int)(y7/(1-(z7/E)));
        double x82D=(int)(x8/(1-(z8/E)));
        double y82D=(int)(y8/(1-(z8/E)));

        g2d.setColor(Color.red);
        gp.moveTo(x12D, y12D);
        gp.lineTo(x22D, y22D);
        gp.lineTo(x32D, y32D);
        gp.lineTo(x42D, y42D);
        gp.lineTo(x12D, y12D);
        gp.lineTo(x52D, y52D);
        
        
        gp.moveTo(x22D, y22D);
        gp.lineTo(x62D, y62D);
        
        gp.moveTo(x32D, y32D);
        gp.lineTo(x72D, y72D);
        
        gp.moveTo(x42D, y42D);
        gp.lineTo(x82D, y82D);
        gp.lineTo(x72D, y72D);
        gp.lineTo(x62D, y62D);
        gp.lineTo(x52D, y52D);
        gp.lineTo(x42D, y82D);


        g2d.draw(gp);

    }

    
    
    public static void main(String[] args) {
        Modul9 jf = new Modul9();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
}
