import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCal{

    public static void main(String args[]) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JLabel label1 = new JLabel("Enter 1st Value:");
        JTextField text1 = new JTextField();
        JLabel label2 = new JLabel("Enter 2nd Value:");
        JTextField text2 = new JTextField();
        JLabel label3 = new JLabel("Result:");
        JTextField text3 = new JTextField();
        text3.setEditable(false);

        inputPanel.add(label1);
        inputPanel.add(text1);
        inputPanel.add(label2);
        inputPanel.add(text2);
        inputPanel.add(label3);
        inputPanel.add(text3);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 3));
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton modulusButton = new JButton("%");
        JButton clearButton = new JButton("Clear");

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(modulusButton);
        buttonPanel.add(clearButton);

        addButton.addActionListener(new OperationListener(text1, text2, text3, "+"));
        subtractButton.addActionListener(new OperationListener(text1, text2, text3, "-"));
        multiplyButton.addActionListener(new OperationListener(text1, text2, text3, "*"));
        divideButton.addActionListener(new OperationListener(text1, text2, text3, "/"));
        modulusButton.addActionListener(new OperationListener(text1, text2, text3, "%"));
        clearButton.addActionListener(e -> {
            text1.setText("");
            text2.setText("");
            text3.setText("");
        });

        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private static class OperationListener implements ActionListener {
        private final JTextField text1;
        private final JTextField text2;
        private final JTextField result;
        private final String operation;

        public OperationListener(JTextField text1, JTextField text2, JTextField result, String operation) {
            this.text1 = text1;
            this.text2 = text2;
            this.result = result;
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double res = 0;
                switch (operation) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            res = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                            return;
                        }
                        break;
                    case "%":
                        res = num1 % num2;
                        break;
                }
                result.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
            }
        }
    }
}
