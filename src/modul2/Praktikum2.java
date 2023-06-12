package modul2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Praktikum2 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        int xwc1=4, ywc1=5, xwc2=8, ywc2=10; // Word koord titik ujung garis 
        int wl=2, wr=10, wb=4, wt=12; // batas ukuran window
        int vl=100, vr=400, vt=100, vb=400; // batas ukuraan vieport
        int xsc1=0,ysc1=0,xsc2=0,ysc2=0; // Screen koord titik ujung garis


//        Menghitung konversi
        int sx=(vr-vl)/(wr-wl);
        int sy=(vt-vb)/(wt-wb);
        int tx=((vl*wr)-(wl*vr))/(wr-wl);
        int ty=((vb*wt)-(wb*vt))/(wt-wb);

        xsc1=(sx*xwc1)+tx;
        ysc1=(sy*ywc1)+ty;

        xsc2=(sx*xwc2)+tx;
        ysc2=(sy*ywc2)+ty;
        
//        Display
        System.out.println("sx : " + sx);
        System.out.println("sy : " + sy);
        System.out.println("tx : " + tx);
        System.out.println("ty : " + ty);
        System.out.println("xsc1 : " + xsc1);
        System.out.println("ysc1 : " + ysc1);
        System.out.println("xsc2 : " + xsc2);
        System.out.println("ysc2 : " + ysc2);
        
//        menggambar
        Graphics2D gd = (Graphics2D) g;
        
        gd.setColor(Color.red);
        
//        Menggambar segi empat dengan viewport
        gd.drawRect(vl, vt, vr, vb);
        gd.drawLine(xsc1, ysc1, xsc2, ysc2);
    }

    
    
    public static void main(String[] args) {
        Praktikum2 jp = new Praktikum2();
        JFrame jf = new JFrame();

        jf.setSize(1000, 1080);
        jf.setLocationRelativeTo(null);
        jf.add(jp);
        jf.setTitle("Praktikum2 - Garis Dalam Kotak");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
