package modul7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Modul7 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        Graphics2D gd = (Graphics2D) g;
        GeneralPath gp = new GeneralPath();
        
//        --- Menggambar Area Visible
        int xmin=200, ymin=(600-100), xmax=600, ymax=600-500;
        gd.setPaint(Color.GREEN);
        gp.moveTo(xmin, ymin);
        gp.lineTo(xmax, ymin);
        gp.lineTo(xmax, ymax);
        gp.lineTo(xmin, ymax);
        gp.lineTo(xmin, ymin);
        gd.draw(gp);
        
//        --- Menggambar garis
        int x1=100, y1=(600-50), x2=700, y2=(600-500);
        gd.drawLine(x1, y1, x2, y2);

//         --- Menghitung Gradien Garis
        double m=(y2-y1)/(x2-x1);

//        --- Menghitung titik potong
        int xp1=(int) (x1 + ((ymax - y1)/m));
        int yp2=(int) (y1 + (m * (xmin - x1)));

//        --- Memotong Garis
        gd.drawLine(xmin, yp2, xp1, ymax);
    }

    
    
    public static void main(String[] args) {
        Modul7 jp = new Modul7();
        JFrame jf = new JFrame();
        
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Modul 8");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
