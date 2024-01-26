import java.awt.*;
// import java.swing.*;

public class CalculatorDesign{
 
    public static void main(String args[])
    {
        // System.out.println("hello");
        Frame  win = new Frame();

        Label heading = new Label("Calculator");
        Label l1 = new Label("Enter 1st Value");
        Label l2 = new Label("Enter 2nd Value");
        Label l3 = new Label("Result");

        TextField text1 = new TextField();
        TextField text2 = new TextField();
        TextField text3 = new TextField();

        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("*");
        Button b4 = new Button("/");
        Button b5 = new Button("%");

        Button clear = new Button("Clear");
        Button aboutme = new Button("About me");
        Button exit = new Button("Exit");

        Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        heading.setFont(f);

        l1.setBounds(100,100,100,25);
        text1.setBounds(210,100,100,25);
        l2.setBounds(100,130,100,25);
        text2.setBounds(210,130,100,25);

        text3.setBounds(210,190,100,25);
        l3.setBounds(100,190,100,25);


        b1.setBounds(100,160,50,25);
        b2.setBounds(160,160,50,25);
        b3.setBounds(220,160,50,25);
        b4.setBounds(280,160,50,25);
        b5.setBounds(340,160,50,25);

        clear.setBounds(100, 250,100,25);
        aboutme.setBounds(220, 250,100,25);
        exit.setBounds(340, 250,100,25);
        heading.setBounds(220,50,200,25);

        win.setLayout(null);
        win.add(heading);
        win.add(l1);
        win.add(l2);
        win.add(l3);

        win.add(text1);
        win.add(text2);
        win.add(text3);

        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);
        win.add(b5);

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        win.setBounds(0,0, 500, 500);
        win.show();

    }

}