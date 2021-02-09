import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCounter extends JFrame {
    private JButton plusButton;
    private JButton minusButton;
    private JTextField numberTextField;
    private int number = 0;

    private void updateNumberTextField() {
        numberTextField.setText("" + number);
    }

    public SwingCounter() {
        setBounds(400, 400, 150, 150);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("Счетчик");

        add(new Label("Число"));
        numberTextField = new JTextField("" + number, 2);
        numberTextField.setEditable(false);
        add(numberTextField);

        plusButton = new JButton("+1");
        minusButton = new JButton("-1");

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number < 3) {
                    number++;
                    updateNumberTextField();
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number > -5) {
                    number--;
                    updateNumberTextField();
                }
            }
        });

        add(plusButton);
        add(minusButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCounter();
    }
}