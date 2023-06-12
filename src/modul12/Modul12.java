/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul12;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Modul12 extends Frame implements Runnable {
    Thread animation;
    int frameDelay = 500;
    Image frames[];
    int numFrames;
    int currentFrame = 0;
    long lastDisplay = 0;
    int screenWidth = 600;
    int screenHeight = 600;
    
    public static void main(String[] args) throws IOException {
        Modul12 app = new Modul12 ();
    }
    
    public Modul12 () throws IOException {
        super("Animasi Grafik");
        setup();
        setSize(screenWidth,screenHeight);
        addWindowListener(new WindowEventHandler());
        show();
        animation = new Thread(this);
        animation.start();
    }
    
    void setup() throws IOException {
            setupMenuBar();
            setFont(new Font("default",Font.BOLD,18));
            Toolkit toolkit = getToolkit();
            frames = new Image[10];
            // objek yang akan ditampilkan
            frames[0] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja7.png");
            frames[1] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja8.png");
            frames[2] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja1.png");
            frames[3] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja2.png");
            frames[4] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja3.png");
            frames[5] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja4.png");
            frames[6] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja5.png");
            frames[7] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja6.png");
            frames[8] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja2.png");
            frames[9] = toolkit.getImage("D:\\Code Files\\Netbeans\\GrafikaA1\\src\\modul12\\Ninja1.png");



            numFrames = frames.length;
    }
    
    void setupMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem fileExit = new MenuItem("Exit");
        fileExit.addActionListener(new MenuItemHandler());
        fileMenu.add(fileExit);
        menuBar.add(fileMenu);
        setMenuBar(menuBar);
    }
    
    public void paint(Graphics g) {
        g.drawImage(frames[currentFrame],125,80,this);
    }
    
    public void run() {
    // Perulangan animasi
        do {
            long time = System.currentTimeMillis();
            if (time - lastDisplay > frameDelay) {
                repaint();
                try {
                    Thread.sleep(frameDelay);
                }catch(InterruptedException ex){

                }
                ++currentFrame;
                currentFrame %= numFrames;
                lastDisplay = time;
            }
        } while (true);
    }
    
    class MenuItemHandler implements ActionListener, ItemListener {
        public void actionPerformed(ActionEvent ev){
            String s=ev.getActionCommand();
            if(s=="Exit"){
            System.exit(0);
        }
    }
        public void itemStateChanged(ItemEvent e){
        }
    }
   //Kelas yang digunakan agar tombol close pada frame bisa berfungsi
   class WindowEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
   }

    
}
