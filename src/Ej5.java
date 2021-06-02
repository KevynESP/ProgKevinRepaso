import javax.swing.*;
import java.awt.event.*;

public class Ej5 extends JFrame implements ActionListener {
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private Timer temp;
    private int cont;

    public Ej5() {
        super("Tragavergas");
        this.setLayout(null);

        jTextField1 = new JTextField();
        jTextField1.setBounds(10, 10, 50, 27);
        jTextField1.setEditable(false);
        this.add(jTextField1);

        jTextField2 = new JTextField();
        jTextField2.setBounds(65, 10, 50, 27);
        jTextField2.setEditable(false);
        this.add(jTextField2);

        jTextField3 = new JTextField();
        jTextField3.setBounds(120, 10, 50, 27);
        jTextField3.setEditable(false);
        this.add(jTextField3);

        jButton1 = new JButton("Jugar");
        jButton1.setBounds(45, 47, 100, 27);
        jButton1.addActionListener(this);
        this.add(jButton1);

        jLabel1 = new JLabel();
        jLabel1.setBounds(75, 77, 50, 27);
        this.add(jLabel1);

        jLabel2 = new JLabel();
        jLabel2.setBounds(10, 77, 50, 27);
        temp = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont++;
                jLabel2.setText(cont + "");

            }
        });
        cont = 0;
        this.add(jLabel2);
        temp.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            jTextField1.setText("" + (int) (Math.random() * (6 - 1 + 1) + 1));
            jTextField2.setText("" + (int) (Math.random() * (6 - 1 + 1) + 1));
            jTextField3.setText("" + (int) (Math.random() * (6 - 1 + 1) + 1));
            if (jTextField1.getText().equals(jTextField2.getText())
                    && jTextField1.getText().equals(jTextField3.getText())) {
                jLabel1.setText("Premio!");
            } else {
                jLabel1.setText("Loser");
            }
        }

    }

    public static void main(String[] args) {
        Ej5 ej5 = new Ej5();
        ej5.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ej5.setVisible(true);
        ej5.setBounds(550, 300, 217, 145);
    }
}
