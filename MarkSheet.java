import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class MarkSheet implements ActionListener {
    Frame win = new Frame();

    Label l1 = new Label("Enter Java Marks");
    Label l2 = new Label("Enter C# Marks");
    Label l3 = new Label("Enter Python Marks");
    Label l4 = new Label("Enter Wb Marks");
    Label l5 = new Label("Enter C++ Marks");

    Label heading = new Label("MarkSheet");
    Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);

    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    TextField text4 = new TextField();
    TextField text5 = new TextField();

    Button b1 = new Button("Calculate");

    Label Ob = new Label("Obtain Marks");
    Label Tl = new Label("Total Marks");
    Label Per = new Label("Percentage");
    Label Gd = new Label("Grade");

    TextField text6 = new TextField();
    TextField text7 = new TextField();
    TextField text8 = new TextField();
    TextField text9 = new TextField();

    Button clear = new Button("Clear");
    Button aboutme = new Button("About me");
    Button exit = new Button("Exit");

    MarkSheet() {
        heading.setFont(f);
        heading.setBounds(200, 50, 200, 25);

        l1.setBounds(100, 100, 100, 25);
        l2.setBounds(100, 130, 100, 25);
        l3.setBounds(100, 160, 100, 25);
        l4.setBounds(100, 190, 100, 25);
        l5.setBounds(100, 220, 100, 25);

        b1.setBounds(100, 250, 100, 25);

        text1.setBounds(210, 100, 100, 25);
        text2.setBounds(210, 130, 100, 25);
        text3.setBounds(210, 160, 100, 25);
        text4.setBounds(210, 190, 100, 25);
        text5.setBounds(210, 220, 100, 25);

        Ob.setBounds(100, 280, 100, 25);
        Tl.setBounds(100, 310, 100, 25);
        Per.setBounds(100, 340, 100, 25);
        Gd.setBounds(100, 370, 100, 25);

        text6.setBounds(210, 280, 100, 25);
        text7.setBounds(210, 310, 100, 25);
        text8.setBounds(210, 340, 100, 25);
        text9.setBounds(210, 370, 100, 25);

        clear.setBounds(100, 420, 100, 25);
        aboutme.setBounds(210, 420, 100, 25);
        exit.setBounds(320, 420, 100, 25);

        win.setLayout(null);
        win.add(heading);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l4);
        win.add(l5);

        win.add(text1);
        win.add(text2);
        win.add(text3);
        win.add(text4);
        win.add(text5);

        win.add(Ob);
        win.add(Tl);
        win.add(Per);
        win.add(Gd);

        win.add(text6);
        win.add(text7);
        win.add(text8);
        win.add(text9);

        win.add(b1);

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        b1.addActionListener(this);
        clear.addActionListener(this);
        aboutme.addActionListener(this);
        exit.addActionListener(this);

        win.setVisible(true);
        win.setBounds(0, 0, 500, 500);
        win.show();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int javaMarks = Integer.parseInt(text1.getText());
            int cSharpMarks = Integer.parseInt(text2.getText());
            int pythonMarks = Integer.parseInt(text3.getText());
            int wbMarks = Integer.parseInt(text4.getText());
            int cppMarks = Integer.parseInt(text5.getText());
    
            int obtainMarks = javaMarks + cSharpMarks + pythonMarks + wbMarks + cppMarks;
            text6.setText(Integer.toString(obtainMarks));
    
            int totalMarks = 500; // Assuming total marks for all subjects is 500
            text7.setText(Integer.toString(totalMarks));
    
            double percentage = ((double) obtainMarks / totalMarks) * 100;
            text8.setText(Double.toString(percentage));
    
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "Fail";
            }
            text9.setText(grade);
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
        } else if (e.getSource() == aboutme) {
           JOptionPane.showMessageDialog(win,"Jibran Ali");
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        MarkSheet ob = new MarkSheet();
    }
}
