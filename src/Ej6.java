import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class Ej6 extends JFrame implements ActionListener, KeyListener{
    private JTextField jTextField;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JLabel jLabel;
    private JButton jButton;

    public Ej6(){
        super("Ejercicio8");
        this.setLayout(new FlowLayout());

        jTextField = new JTextField(5);
        this.add(jTextField);

        jTextField2 = new JTextField(5);
        this.add(jTextField2);

        jTextField3 = new JTextField(5);
        this.add(jTextField3);

        jTextField4 = new JTextField(10);
        jTextField4.addKeyListener(this);
        this.add(jTextField4);

        jLabel = new JLabel();
        this.setSize(getPreferredSize().width, getPreferredSize().height);
        this.add(jLabel);

        jButton = new JButton("Cambiar");
        jButton.addActionListener(this);
        this.add(jButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Color color = new Color(Integer.parseInt(jTextField.getText()),Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField3.getText()));
            if ((e.getModifiers()&ActionEvent.CTRL_MASK) == ActionEvent.CTRL_MASK){
                jButton.setForeground(color);
            }else{
                jButton.setBackground(color);
            }
        } catch (IllegalArgumentException i) {
           
        }
    }

    public static void main(String[] args) {
        Ej6 ej6 = new Ej6();
        ej6.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ej6.setBounds(600, 300, 300, 150);
        ej6.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            jLabel.setIcon(new ImageIcon(jTextField4.getText()));
            jTextField2.setBackground(jButton.getBackground());
        }
    }
}
