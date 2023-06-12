package modul10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

public class Modul10 extends JFrame{
    public Modul10(){
        super("Proyeksi");
        setSize(1000,800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @Override
    public void paint (Graphics g) {
        super.paintComponents(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath gp = new GeneralPath();

        //--- Menggambar Objek 3 Dimensi
        double x1=100, y1=500-200, z1=0, x2=300, y2=500-200,
        z2=0, x3=300, y3=500-200, z3=200, x4=100, y4=500-200,
        z4=200, x5=200, y5=500-400, z5=200;

        double E= 1000;

        double x12D=(x1/(1-(z1/E)));
        double y12D=(y1/(1-(z1/E)));
        double x22D=(x2/(1-(z2/E)));
        double y22D=(y2/(1-(z2/E)));
        double x32D=(x3/(1-(z3/E)));
        double y32D=(y3/(1-(z3/E)));
        double x42D=(x4/(1-(z4/E)));
        double y42D=(y4/(1-(z4/E)));
        double x52D=(x5/(1-(z5/E)));
        double y52D=(y5/(1-(z5/E)));

        // ---- Gambar hasil Proyeksi ------
        g2d.setColor(Color.red);
        gp.moveTo(x12D, y12D);
        gp.lineTo(x22D, y22D);
        gp.lineTo(x32D, y32D);
        gp.lineTo(x42D, y42D);
        gp.lineTo(x12D, y12D);
        gp.lineTo(x52D, y52D);
        gp.moveTo(x22D, y22D);
        gp.lineTo(x52D, y52D);
        gp.moveTo(x32D, y32D);
        gp.lineTo(x52D, y52D);
        gp.moveTo(x42D, y42D);
        gp.lineTo(x52D, y52D);


        //-----Inisiasi koordinat titik sudut------
        double matrixKoordinatTitik[][] = new double[5][4];
        matrixKoordinatTitik[0][0]= x1;
        matrixKoordinatTitik[0][1]= y1;
        matrixKoordinatTitik[0][2]= z1;
        matrixKoordinatTitik[0][3]= 1;
        matrixKoordinatTitik[1][0]= x2;
        matrixKoordinatTitik[1][1]= y2;
        matrixKoordinatTitik[1][2]= z2;
        matrixKoordinatTitik[1][3]= 1;
        matrixKoordinatTitik[2][0]= x3;
        matrixKoordinatTitik[2][1]= y3;
        matrixKoordinatTitik[2][2]= z3;
        matrixKoordinatTitik[2][3]= 1;
        matrixKoordinatTitik[3][0]= x4;
        matrixKoordinatTitik[3][1]= y4;
        matrixKoordinatTitik[3][2]= z4;
        matrixKoordinatTitik[3][3]= 1;
        matrixKoordinatTitik[4][0]= x5;
        matrixKoordinatTitik[4][1]= y5;
        matrixKoordinatTitik[4][2]= z5;
        matrixKoordinatTitik[4][3]= 1;

        //------Inisiasi Matrik Translasi -------
        double Trx=275;
        double Try=0;
        double Trz=0;
        double matrixTransformasi3D[][] = new double[4][4];
        matrixTransformasi3D[0][0]= 1;
        matrixTransformasi3D[0][1]= 0;
        matrixTransformasi3D[0][2]= 0;
        matrixTransformasi3D[0][3]= 0;
        matrixTransformasi3D[1][0]= 0;
        matrixTransformasi3D[1][1]= 1;
        
        matrixTransformasi3D[1][2]= 0;
        matrixTransformasi3D[1][3]= 0;
        matrixTransformasi3D[2][0]= 0;
        matrixTransformasi3D[2][1]= 0;
        matrixTransformasi3D[2][2]= 1;
        matrixTransformasi3D[2][3]= 0;
        matrixTransformasi3D[3][0]= Trx;
        matrixTransformasi3D[3][1]= Try;
        matrixTransformasi3D[3][2]= Trz;
        matrixTransformasi3D[3][3]= 1;

        //--- Perkalian Matrix-----
        double matrixhasilTransformasi[][] = new double[5][4];
        for( int i=0; i<5; i++ ){
        for( int j=0; j<4; j++ ){
        matrixhasilTransformasi[i][j]=0;
        for( int k=0; k<4; k++ ){
        matrixhasilTransformasi[i][j]=matrixhasilTransformasi[i][j] +
        ( matrixKoordinatTitik[i][k] * matrixTransformasi3D[k][j]);
        }
        }
        }
        //------ Baca Koordinat hasil Transformasi------
        x1=matrixhasilTransformasi[0][0];
        y1=matrixhasilTransformasi[0][1];
        z1=matrixhasilTransformasi[0][2];
        x2=matrixhasilTransformasi[1][0];
        y2=matrixhasilTransformasi[1][1];
        z2=matrixhasilTransformasi[1][2];
        x3=matrixhasilTransformasi[2][0];
        y3=matrixhasilTransformasi[2][1];
        z3=matrixhasilTransformasi[2][2];
        x4=matrixhasilTransformasi[3][0];
        y4=matrixhasilTransformasi[3][1];
        z4=matrixhasilTransformasi[3][2];
        x5=matrixhasilTransformasi[4][0];
        y5=matrixhasilTransformasi[4][1];
        z5=matrixhasilTransformasi[4][2];

        //--- Hitung Proyeksi ke 2 Dimensi--------------------
        double x12Dh=(int)(x1/(1-(z1/E)));
        double y12Dh=(int)(y1/(1-(z1/E)));
        double x22Dh=(int)(x2/(1-(z2/E)));
        double y22Dh=(int)(y2/(1-(z2/E)));
        double x32Dh=(int)(x3/(1-(z3/E)));
        double y32Dh=(int)(y3/(1-(z3/E)));
        double x42Dh=(int)(x4/(1-(z4/E)));
        double y42Dh=(int)(y4/(1-(z4/E)));
        double x52Dh=(int)(x5/(1-(z5/E)));
        double y52Dh=(int)(y5/(1-(z5/E)));

        // ---- Gambar hasil Proyeksi ------
        gp.moveTo(x12Dh, y12Dh);
        gp.lineTo(x22Dh, y22Dh);
        gp.lineTo(x32Dh, y32Dh);
        gp.lineTo(x42Dh, y42Dh);
        gp.lineTo(x12Dh, y12Dh);
        gp.lineTo(x52Dh, y52Dh);
        gp.moveTo(x22Dh, y22Dh);
        gp.lineTo(x52Dh, y52Dh);
        gp.moveTo(x32Dh, y32Dh);
        gp.lineTo(x52Dh, y52Dh);
        gp.moveTo(x42Dh, y42Dh);
        gp.lineTo(x52Dh, y52Dh);

        g2d.draw(gp);
    }

    
    public static void main(String[] args) {
        Modul10 gambar = new Modul10();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
