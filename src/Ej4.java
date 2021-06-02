import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class Ej4 extends JFrame implements ActionListener{
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel jLabel1;
    private JButton suma;
    private JButton division;
    private JButton raiz;

    public Ej4(){
        super("Calcu");
        this.setLayout(new FlowLayout());

        jTextField1 = new JTextField(5);
        this.add(jTextField1);

        jTextField2 = new JTextField(5);
        this.add(jTextField2);

        jLabel1 = new JLabel();
        this.add(jLabel1);

        suma = new JButton("suma");
        suma.addActionListener(this);
        this.add(suma);

        division = new JButton("division");
        division.addActionListener(this);
        this.add(division);

        raiz = new JButton("raiz");
        raiz.addActionListener(this);
        this.add(raiz);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == suma){
            try {
            jLabel1.setForeground(Color.BLACK);
            jLabel1.setText(String.format("= %.3f", Float.parseFloat(jTextField1.getText())+Float.parseFloat(jTextField2.getText())));
            } catch (NumberFormatException i) {
                jLabel1.setForeground(Color.red);
                jLabel1.setText("no válido");
            }
        }if (e.getSource() == division) {
            try {
            jLabel1.setForeground(Color.BLACK);
            jLabel1.setText(String.format("= %.3f", Float.parseFloat(jTextField1.getText())/Float.parseFloat(jTextField2.getText())));
            } catch (NumberFormatException i) {
                jLabel1.setForeground(Color.red);
                jLabel1.setText("no válido");
            }
        }if (e.getSource() == raiz) {
            try {
                jLabel1.setForeground(Color.BLACK);
                if (Integer.parseInt(jTextField1.getText()) < 0) {
                    jLabel1.setForeground(Color.red);
                    jLabel1.setText("no válido");
                }else{
                    jLabel1.setText(String.format("= %.3f", Math.sqrt(Double.parseDouble(jTextField1.getText()))));
                }
                } catch (NumberFormatException i) {
                    jLabel1.setForeground(Color.red);
                    jLabel1.setText("no válido");
                }
        }
        
    }
    public static void main(String[] args) {
        Ej4 ej4 = new Ej4();
        ej4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ej4.setBounds(450, 300, 400, 75);
        ej4.setVisible(true);
    }

}
