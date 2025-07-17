import java.awt.*;
import java.awt.event.*;

class Cal extends Frame implements ActionListener, WindowListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8;
    TextField tx1, tx2, tx3;

    public Cal() {

        setLayout(null);

        setBackground(Color.red);
        tx1 = new TextField(20);
        tx1.setBounds(150, 100, 40, 40);
        // tx1.setBackground(Color.GRAY);
        add(tx1);

        tx2 = new TextField(20);
        tx2.setBounds(150, 150, 40, 40);
        // tx2.setBackground(Color.GRAY);
        add(tx2);

        tx3 = new TextField();
        tx3.setBounds(220, 125, 120, 40);
        // tx3.setBackground(Color.GRAY);
        add(tx3);

        b1 = new Button("+");
        b1.setBounds(150, 225, 50, 40);
        add(b1);
        b1.setBackground(Color.lightGray);
        b1.addActionListener(this);

        b2 = new Button("-");
        b2.setBounds(220, 225, 50, 40);
        add(b2);
        b2.setBackground(Color.lightGray);
        b2.addActionListener(this);

        b3 = new Button("*");
        b3.setBounds(290, 225, 50, 40);
        add(b3);
        b3.setBackground(Color.lightGray);
        b3.addActionListener(this);

        b4 = new Button("/");
        b4.setBounds(150, 275, 50, 40);
        add(b4);
        b4.setBackground(Color.lightGray);

        b4.addActionListener(this);

        b5 = new Button("%");
        b5.setBounds(220, 275, 50, 40);
        add(b5);
        b5.setBackground(Color.lightGray);
        b5.addActionListener(this);

        b6 = new Button("C");
        b6.setBounds(290, 275, 50, 40);
        add(b6);
        b6.setBackground(Color.lightGray);

        b6.addActionListener(this);

        b7 = new Button("CLEAR");
        b7.setBounds(150, 325, 90, 40);
        add(b7);
        b7.setBackground(Color.lightGray);

        b7.addActionListener(this);

        b8 = new Button("QUIT");
        b8.setBounds(250, 325, 90, 40);
        add(b8);
        b8.setBackground(Color.lightGray);

        b8.addActionListener(this);
        addWindowListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("+")) {
            int n1 = Integer.parseInt(tx1.getText());
            int n2 = Integer.parseInt(tx2.getText());
            double res = n1 + n2;
            tx3.setText(String.valueOf("ADD is :" + res));
        }

        else if (str.equals("-")) {
            int n1 = Integer.parseInt(tx1.getText());
            int n2 = Integer.parseInt(tx2.getText());
            double res = n1 - n2;
            tx3.setText(String.valueOf("SUB is :" + res));
        } else if (str.equals("*")) {
            int n1 = Integer.parseInt(tx1.getText());
            int n2 = Integer.parseInt(tx2.getText());
            double res = n1 * n2;
            tx3.setText(String.valueOf("MUL is :" + res));
        }

        else if (str.equals("/")) {
            int n1 = Integer.parseInt(tx1.getText());
            int n2 = Integer.parseInt(tx2.getText());
            double res = n1 / n2;
            tx3.setText(String.valueOf("DIV is :" + res));
        } else if (str.equals("%")) {
            int n1 = Integer.parseInt(tx1.getText());
            int n2 = Integer.parseInt(tx2.getText());
            double res = n1 % n2;
            tx3.setText(String.valueOf("MOD is :" + res));
        } else if (str.equals("CLEAR")) {
            tx1.setText("");
            tx2.setText("");
            tx3.setText("");

        } else if (str.equals("QUIT")) {
            System.exit(0);
        } else {
            tx1.setText("0");
            tx3.setText("0");
            tx2.setText("0");
        }

    }

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    /*
     * public void mouseClicked(MouseEvent me) {
     * // b1.setBackground(Color.red);
     * }
     * 
     * public void mousePressed(MouseEvent me) {
     * 
     * }
     * 
     * public void mouseReleased(MouseEvent me) {
     * // b1.setBackground(Color.red);
     * }
     * 
     * public void mouseEntered(MouseEvent me) {
     * b1.setBackground(Color.GRAY);
     * b2.setBackground(Color.GRAY);
     * }
     * 
     * public void mouseExited(MouseEvent me) {
     * b1.setBackground(Color.lightGray);
     * b2.setBackground(Color.lightGray);
     * 
     * }
     * /
     * 
     */

}

public class Calc1 {

    public static void main(String args[]) {
        Cal obj = new Cal();
        obj.setVisible(true);
        obj.setSize(500, 700);
        obj.setTitle("--Small Calculator--");

    }
}
