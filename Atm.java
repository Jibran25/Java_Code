import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Atm implements ActionListener {
    Frame win = new Frame();

    Label l1 = new Label("Enter Rupees");
    Label l2 = new Label("5000");
    Label l3 = new Label("1000");
    Label l4 = new Label("500");
    Label l5 = new Label("100");
    Label l6 = new Label("50");
    Label l7 = new Label("20");
    Label l8 = new Label("10");
    Label l9 = new Label("5");
    Label l10 = new Label("2");
    Label l11 = new Label("1");

    Label heading = new Label("ATM");
    // Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
    // heading.setFont(f);

    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    TextField text4 = new TextField();
    TextField text5 = new TextField();
    TextField text6 = new TextField();
    TextField text7 = new TextField();
    TextField text8 = new TextField();
    TextField text9 = new TextField();
    TextField text10 = new TextField();
    TextField text11 = new TextField();

    Button b1 = new Button("Convert");

    Button clear = new Button("Clear");
    Button aboutme = new Button("About me");
    Button exit = new Button("Exit");

    Atm() {
        Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        heading.setFont(f);
        heading.setBounds(200, 50, 200, 25);

        l1.setBounds(100, 100, 100, 25);
        l2.setBounds(100, 130, 100, 25);
        l3.setBounds(100, 160, 100, 25);
        l4.setBounds(100, 190, 100, 25);
        l5.setBounds(100, 220, 100, 25);
        l6.setBounds(100, 250, 100, 25);
        l7.setBounds(100, 280, 100, 25);
        l8.setBounds(100, 310, 100, 25);
        l9.setBounds(100, 340, 100, 25);
        l10.setBounds(100, 370, 100, 25);
        l11.setBounds(100, 410, 100, 25);

        b1.setBounds(370, 100, 100, 25);

        text1.setBounds(210, 100, 100, 25);
        text2.setBounds(210, 130, 100, 25);
        text3.setBounds(210, 160, 100, 25);
        text4.setBounds(210, 190, 100, 25);
        text5.setBounds(210, 220, 100, 25);
        text6.setBounds(210, 250, 100, 25);
        text7.setBounds(210, 280, 100, 25);
        text8.setBounds(210, 310, 100, 25);
        text9.setBounds(210, 340, 100, 25);
        text10.setBounds(210, 370, 100, 25);
        text11.setBounds(210, 410, 100, 25);

        clear.setBounds(100, 450, 100, 25);
        aboutme.setBounds(210, 450, 100, 25);
        exit.setBounds(320, 450, 100, 25);

        win.setLayout(null);
        win.add(heading);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l4);
        win.add(l5);
        win.add(l6);
        win.add(l7);
        win.add(l8);
        win.add(l9);
        win.add(l10);
        win.add(l11);

        win.add(text1);
        win.add(text2);
        win.add(text3);
        win.add(text4);
        win.add(text5);
        win.add(text6);
        win.add(text7);
        win.add(text8);
        win.add(text9);
        win.add(text10);
        win.add(text11);

        win.add(b1);
        win.add(heading);

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        b1.addActionListener(this);
        clear.addActionListener(this);
        aboutme.addActionListener(this);
        exit.addActionListener(this);

        win.setVisible(true);
        win.setBounds(0, 0, 500, 500);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int rupees = Integer.parseInt(text1.getText());
            int[] denominations = { 5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

            for (int i = 0; i < denominations.length; i++) {
                int count = rupees / denominations[i];
                rupees %= denominations[i];
                switch (i) {
                    case 0:
                        text2.setText(Integer.toString(count));
                        break;
                    case 1:
                        text3.setText(Integer.toString(count));
                        break;
                    case 2:
                        text4.setText(Integer.toString(count));
                        break;
                    case 3:
                        text5.setText(Integer.toString(count));
                        break;
                    case 4:
                        text6.setText(Integer.toString(count));
                        break;
                    case 5:
                        text7.setText(Integer.toString(count));
                        break;
                    case 6:
                        text8.setText(Integer.toString(count));
                        break;
                    case 7:
                        text9.setText(Integer.toString(count));
                        break;
                    case 8:
                        text10.setText(Integer.toString(count));
                        break;
                    case 9:
                        text11.setText(Integer.toString(count));
                        break;
                    default:
                        break;
                }
            }
        } else if (e.getSource() == clear) {
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            text8.setText("");
            text9.setText("");
            text10.setText("");
            text11.setText("");
        } else if (e.getSource() == aboutme) {
            JOptionPane.showMessageDialog(win, "My name is Jibran");
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        Atm atm = new Atm();
    }
}
