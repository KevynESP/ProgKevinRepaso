import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ej8 extends JFrame implements ActionListener{
    private ArrayList<JLabel> frames;
    private JButton izquierda;
    private JButton derecha;
    private Timer tiempo;
    private int altura;

    public Ej8(){
        super("BomberMan");
        this.setLayout(null);

        frames = new ArrayList<JLabel>();
        for (int i = 0; i < 4; i++) {
            JLabel bomba = new JLabel();
            bomba.setIcon(new ImageIcon("C:/Users/Kekon/Pictures/Saved Pictures/bomba.png"));
            frames.add(bomba);
            bomba.setName("bomba"+i);
        }

        izquierda = new JButton();
        izquierda.setBounds(10, 625, 125, 27);
        this.add(izquierda);

        derecha = new JButton();
        derecha.setBounds(145, 625, 125, 27);
        this.add(derecha);

        tiempo = new Timer(1000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                altura+=3;
                for (JLabel jLabel : frames) {
                    //jLabel.setBounds((int)(Math.random()*((getContentPane().getX()+getContentPane().getWidth())-getContentPane().getX()+1)+getContentPane().getX()),(int)(Math.random()*(getContentPane().getY()-0+1)) , 30, 30);
                }
                frames.get(0).setBounds(750, 300+altura, 30, 30);
            }
            
        });
        altura = 0;
        tiempo.start();
    }

    public static void main(String[] args) {
        Ej8 juego = new Ej8();
        juego.setDefaultCloseOperation(EXIT_ON_CLOSE);
        juego.setBounds(700, 300, 300, 700);
        juego.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
