import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ej3 extends JFrame implements ActionListener, ItemListener {

    private JTextField textField1;
    private JButton jButton1;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private String nombre;

    public Ej3() {
        super("Ejercicio3");
        this.setLayout(new FlowLayout());

        textField1 = new JTextField(5);
        this.add(textField1);

        jButton1 = new JButton("Aceptar");
        jButton1.setSize(100, 27);
        jButton1.addActionListener(this);
        this.add(jButton1);

        jCheckBox1 = new JCheckBox();
        jCheckBox1.addItemListener(this);
        this.add(jCheckBox1);

        jCheckBox2 = new JCheckBox();
        jCheckBox2.addItemListener(this);
        this.add(jCheckBox2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            if (!jCheckBox1.isSelected()) {
                nombre = textField1.getText();
            } else {
                nombre = "";
                for (int i = textField1.getText().length() - 1; i >= 0; i--) {
                    nombre += textField1.getText().charAt(i);
                }
            }
            int res = JOptionPane.showConfirmDialog(this, "Quieres poner " + nombre + "?", "Duda",
                    JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == res) {
                this.setTitle(nombre);
            }
        }
    }

    public static void main(String[] args) {
        Ej3 ej3 = new Ej3();
        ej3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ej3.setBounds(450, 300, 400, 75);
        ej3.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (jCheckBox2.isSelected()) {
            textField1.setEnabled(false);
        } else {
            textField1.setEnabled(true);
        }
    }
}
