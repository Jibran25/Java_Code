import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tictoe implements ActionListener {
    private JFrame frame;
    private JButton[] buttons;
    private JLabel label;
    private boolean isXNext = true;

    Tictoe() {
        frame = new JFrame("Tic-Tac-Toe");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        label = new JLabel("X's Turn");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(label);
        bottomPanel.add(restartButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (buttonClicked.getText().equals("")) {
            if (isXNext) {
                buttonClicked.setText("X");
                label.setText("O's Turn");
            } else {
                buttonClicked.setText("O");
                label.setText("X's Turn");
            }
            isXNext = !isXNext;

            if (checkForWin()) {
                if (isXNext)
                    label.setText("O Wins!");
                else
                    label.setText("X Wins!");
                disableButtons();
            } else if (checkForDraw()) {
                label.setText("It's a Draw!");
            }
        }
    }

    private boolean checkForWin() {
        return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(buttons[i*3].getText(), buttons[i*3+1].getText(), buttons[i*3+2].getText()))
                return true;
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(buttons[i].getText(), buttons[i+3].getText(), buttons[i+6].getText()))
                return true;
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return (checkRowCol(buttons[0].getText(), buttons[4].getText(), buttons[8].getText())
                || checkRowCol(buttons[2].getText(), buttons[4].getText(), buttons[6].getText()));
    }

    private boolean checkRowCol(String s1, String s2, String s3) {
        return (!s1.equals("") && s1.equals(s2) && s2.equals(s3));
    }

    private boolean checkForDraw() {
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                return false;
            }
        }
        return true;
    }

    private void disableButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }
    private void restartGame() {
        for (JButton button : buttons) {
            button.setText("");
            button.setEnabled(true);
        }
        label.setText("X's Turn");
        isXNext = true;
    }

    public static void main(String[] args) {
        new Tictoe();
    }
}
