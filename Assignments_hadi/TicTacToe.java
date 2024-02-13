import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class TicTacToe implements ActionListener {
    Frame win = new Frame();

    Label heading = new Label("Tic-Tac-Toe");

    Label l1 = new Label("Player 1:");
    Label l2 = new Label("Player 2:");
    Label l3 = new Label("");

    TextField text1 = new TextField();
    TextField text2 = new TextField();

    Button[][] buttons = new Button[3][3];
    Button restart = new Button("Restart");

    int currentPlayer = 1;
    boolean gameOver = false;

    TicTacToe() {
        heading.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
        heading.setBounds(150, 50, 200, 25);

        l1.setBounds(50, 100, 100, 25);
        l2.setBounds(50, 130, 100, 25);
        l3.setBounds(150, 160, 200, 25);

        text1.setBounds(150, 100, 100, 25);
        text2.setBounds(150, 130, 100, 25);

        int x = 50, y = 200, width = 80, height = 80;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new Button("");
                buttons[i][j].setBounds(x + j * (width + 10), y + i * (height + 10), width, height);
                buttons[i][j].addActionListener(this);
                win.add(buttons[i][j]);
            }
        }

        restart.setBounds(150, 550, 100, 25);
        restart.addActionListener(this);

        win.setLayout(null);
        win.add(heading);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(text1);
        win.add(text2);
        win.add(restart);

        win.setVisible(true);
        win.setBounds(0, 0, 600, 600);
    }

    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (e.getSource() == buttons[i][j] && buttons[i][j].getLabel().isEmpty()) {
                        if (currentPlayer == 1) {
                            buttons[i][j].setLabel("X");
                            currentPlayer = 2;
                        } else {
                            buttons[i][j].setLabel("O");
                            currentPlayer = 1;
                        }
                        checkWin();
                    }
                }
            }
        }
        if (e.getSource() == restart) {
            resetGame();
        }
    }

    private void checkWin() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = buttons[i][j].getLabel();
            }
        }
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (checkLine(board[i][0], board[i][1], board[i][2])) {
                endGame(board[i][0] + " wins!");
                return;
            }
            if (checkLine(board[0][i], board[1][i], board[2][i])) {
                endGame(board[0][i] + " wins!");
                return;
            }
        }
        if (checkLine(board[0][0], board[1][1], board[2][2])) {
            endGame(board[0][0] + " wins!");
            return;
        }
        if (checkLine(board[0][2], board[1][1], board[2][0])) {
            endGame(board[0][2] + " wins!");
            return;
        }
        // Check for tie
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].isEmpty()) {
                    tie = false;
                    break;
                }
            }
        }
        if (tie) {
            endGame("It's a tie!");
        }
    }

    private boolean checkLine(String a, String b, String c) {
        return !a.isEmpty() && a.equals(b) && b.equals(c);
    }

    private void endGame(String message) {
        l3.setText(message);
        gameOver = true;
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setLabel("");
            }
        }
        l3.setText("");
        currentPlayer = 1;
        gameOver = false;
    }

    public static void main(String args[]) {
        TicTacToe ticTacToe = new TicTacToe();
    }
}
