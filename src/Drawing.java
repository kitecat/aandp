import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setBounds(450, 400, 450, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Canvas canvas = new Drawing();
        canvas.setSize(450, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawLine(25, 300, 425, 300);
        graphics.drawLine(25, 175, 125, 75);
        graphics.drawLine(125, 75, 225, 175);
        graphics.drawRect(50, 150, 150, 150);
        graphics.drawRect(75, 200, 50, 50);
        graphics.drawLine(150, 100, 150, 75);
        graphics.drawLine(150, 75, 175, 75);
        graphics.drawLine(175, 75, 175, 125);
        graphics.drawArc(275, 50, 150, 200, -71, 322);
        graphics.drawLine(325, 300, 325, 243);
        graphics.drawLine(375, 300, 375, 243);
    }
}
