import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ej2 extends JFrame implements ActionListener{
    JButton boton1;
    JButton boton2;
    JButton boton3;
    
    public Ej2(){
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(new FlowLayout());
        super.setBounds(450, 300, 330, 75);

        boton1 = new JButton("Amarillo");
        boton1.setBounds(10, 10, 100, 27);
        boton1.addActionListener(this);
        this.add(boton1);

        boton2 = new JButton("Azul");
        boton2.setBounds(110, 10, 100, 27);
        boton2.addActionListener(this);
        this.add(boton2);

        boton3 = new JButton("Aleatorio");
        boton3.setBounds(210, 10, 100, 27);
        boton3.addActionListener(this);
        this.add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            getContentPane().setBackground(Color.YELLOW);
        }
        if (e.getSource() == boton2) {
            getContentPane().setBackground(Color.BLUE);
        }
        if (e.getSource() == boton3) {
            this.setBounds((int)(Math.random()*(600-1+1)+1),(int)(Math.random()*(400-1+1)+1), 330, 75);
        }
    }
    public static void main(String[] args) {
        new Ej2();
    }
}
