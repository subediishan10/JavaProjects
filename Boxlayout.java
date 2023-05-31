
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Boxlayout extends JFrame implements ActionListener {
    Button a;
    TextField t;

    public Boxlayout() {
        JFrame f = new JFrame();
        f.setBackground(Color.orange);

        setSize(200, 300);
        t = new TextField();
        TextField t1 = new TextField();
        TextField t2 = new TextField();

        a = new Button("1");
        a.setBackground(Color.red);
        Button b = new Button("2");
        b.setBackground(Color.green);
        Button c = new Button("3");
        c.setBackground(Color.blue);
        Button d = new Button("4");
        d.setBackground(Color.yellow);
        Button e = new Button("5");
        e.setBackground(Color.getHSBColor(6, 4, 3));
        Button g = new Button("6");
        g.setBackground(Color.pink);
        add(t);
        add(t1);
        add(t2);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(g);

        GridLayout bl = new GridLayout(3, 2, 10, 15);
        setLayout(bl);
        setVisible(true);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        g.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            System.out.println(t.getText());
        }
    }

    public static void main(String[] args) {
        new Boxlayout();
    }

}
