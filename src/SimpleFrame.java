import java.awt.*;
import java.awt.event.*;

class SimpleFrame extends Frame {
    SimpleFrame(String s) {
        super(s);
        fr.setSize(400, 150);
        fr.setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleFrame("Моя программа");
    }
}