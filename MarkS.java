import java.awt.*;
import java.awt.event.*;

class MarkSheet extends Frame implements ActionListener, FocusListener {
    Label m1, m2, m3, m4, m5;
    Label tot, ave, res, cls;
    Button b1, b2;
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;

    public MarkSheet() {
        setLayout(null);
        m1 = new Label("Tamil");
        m1.setBounds(20, 50, 50, 45);
        add(m1);

        t1 = new TextField(20);
        t1.setBounds(120, 60, 50, 25);
        add(t1);

        m2 = new Label("English");
        m2.setBounds(20, 90, 50, 45);
        add(m2);

        t2 = new TextField(20);
        t2.setBounds(120, 100, 50, 25);
        add(t2);

        m3 = new Label("Maths");
        m3.setBounds(20, 130, 50, 45);
        add(m3);

        t3 = new TextField(20);
        t3.setBounds(120, 140, 50, 25);
        add(t3);

        m4 = new Label("Science");
        m4.setBounds(20, 170, 50, 45);
        add(m4);

        t4 = new TextField(20);
        t4.setBounds(120, 180, 50, 25);
        add(t4);

        m5 = new Label("Social");
        m5.setBounds(20, 210, 50, 45);
        add(m5);

        t5 = new TextField(20);
        t5.setBounds(120, 220, 50, 25);
        add(t5);
        t5.addFocusListener(this);
        tot = new Label("Total");
        tot.setBounds(20, 250, 50, 45);
        add(tot);

        t6 = new TextField(20);
        t6.setBounds(120, 260, 50, 25);
        add(t6);

        ave = new Label("Average");
        ave.setBounds(20, 290, 50, 45);
        add(ave);

        t7 = new TextField(20);
        t7.setBounds(120, 300, 50, 25);
        add(t7);

        res = new Label("Result");
        res.setBounds(20, 330, 50, 45);
        add(res);

        t8 = new TextField(20);
        t8.setBounds(120, 340, 50, 25);
        add(t8);

        cls = new Label("Class");
        cls.setBounds(20, 370, 50, 45);
        add(cls);
        t9 = new TextField(20);
        t9.setBounds(120, 380, 50, 25);
        add(t9);

        // button ;;

        b1 = new Button("Clear");
        b1.setBounds(20, 420, 55, 25);
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("Quit");
        b2.setBounds(120, 420, 50, 25);
        add(b2);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Clear")) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");

        } else {
            System.exit(0);
        }
    }

    public void focusLost(FocusEvent fe) {
        int m1 = Integer.parseInt(t1.getText());
        int m2 = Integer.parseInt(t2.getText());
        int m3 = Integer.parseInt(t3.getText());
        int m4 = Integer.parseInt(t4.getText());
        int m5 = Integer.parseInt(t5.getText());
        double t = m1 + m2 + m3 + m4 + m5;
        t6.setText(String.valueOf(t));
        double ave = t / 5;
        t7.setText(String.valueOf(ave));

        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
            String res = "Pass";
            t8.setText("Pass");
            t8.setBackground(Color.green);

            if (res == "Pass" && ave >= 90 && ave <= 100) {
                String cls = "First Class";
                t9.setText(String.valueOf(cls));
            } else if (res == "Pass" && ave > 60 && ave <= 80) {
                String cls = "Second Class";
                t9.setText(String.valueOf(cls));
                t9.setBackground(Color.green);
            } else {
                String cls = "Third Class";

                t9.setText(String.valueOf(cls));
                t9.setBackground(Color.green);
            }

        } else {
            String res = "Fail";
            t8.setBackground(Color.red);
            t8.setText(String.valueOf(res));
            String cls = "No Distinction";
            t9.setText(String.valueOf(cls));
            t9.setBackground(Color.red);
        }
    }

    public void focusGained(FocusEvent fe) {

    }

}

public class MarkS {

    public static void main(String args[]) {
        MarkSheet ms = new MarkSheet();
        ms.setVisible(true);
        ms.setSize(400, 600);
        ms.setTitle("--Student MarkSheet--");

    }

}