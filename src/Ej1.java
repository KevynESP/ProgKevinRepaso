import javax.swing.*;
import java.awt.event.*;

public class Ej1 extends JFrame implements ActionListener {
    private JButton boton1;
    private JLabel label1;
    private JTextField texto1;

    public Ej1() {
        super("El dado");
        super.setLayout(null);
        boton1 = new JButton("Tirar");
        boton1.setBounds(10, 10, 100, 27);
        boton1.addActionListener(this);
        this.add(boton1);

        label1 = new JLabel();
        label1.setBounds(130, 10, 100, 27);
        this.add(label1);

        texto1 = new JTextField();
        texto1.setBounds(10, 47, 100, 27);
        this.add(texto1);
    }

    public static void main(String[] args) throws Exception {
        Ej1 ej1 = new Ej1();
        ej1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ej1.setBounds(450, 300, 200, 127);
        ej1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int con = 6;
        if (Integer.parseInt(texto1.getText()) > 1) {
            con = Integer.parseInt(texto1.getText());
        }
        label1.setText((int) (Math.random() * (con - 1 + 1) + 1) + "");
        } catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(this, "No es un límite", "Problema", JOptionPane.ERROR_MESSAGE);
        }
    }
}