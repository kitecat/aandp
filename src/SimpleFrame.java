import java.awt.*;
import java.awt.event.*;

class SimpleFrame extends Frame implements ActionListener {
    TextField aTextField = new TextField();
    TextField bTextField = new TextField();
    TextField sumTextField = new TextField();

    public SimpleFrame(String s) {
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(8, 1, 5, 10));

        panel.add(new Label("a", Label.CENTER));
        panel.add(aTextField);
        panel.add(new Label("b", Label.CENTER));
        panel.add(bTextField);
        panel.add(new Label("sum", Label.CENTER));
        panel.add(sumTextField);

        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        panel.add(calculateButton);
        Button clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        setTitle(s);
        setSize(500, 500);
        add(panel);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleFrame("Сумма двух чисел");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());
            int sum = a + b;
            sumTextField.setText("" + sum);
        } else if (e.getActionCommand().equals("Clear")) {
            aTextField.setText("");
            bTextField.setText("");
            sumTextField.setText("");
        }
    }
}