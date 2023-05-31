import javax.swing.*;
import java.awt.event.*;

class Mouse extends JFrame implements MouseListener, MouseMotionListener {
    JTextField t1, t2;

    public Mouse() {
        setSize(400, 500);
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(200, 250, 100, 20);
        t2.setBounds(200, 150, 100, 25);
        add(t1);
        add(t2);
        setLayout(null);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        t1.setText("In");
    }

    public void mouseExited(MouseEvent e) {
        t1.setText("Out");
    }

    public void mouseMoved(MouseEvent e) {
        String m = "X:" + e.getX() + "Y:" + e.getY();
        t2.setText("" + m);
    }

    public void mouseDragged(MouseEvent e) {
    };

    public void mouseClicked(MouseEvent e) {
    };

    public void mousePressed(MouseEvent e) {
    };

    public void mouseReleased(MouseEvent e) {
    };

    public static void main(String[] args) {
        new Mouse();
    }
}
