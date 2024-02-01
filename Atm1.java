import java.util.*;
import java.awt.*;


public class Atm{
    public static void main(String args[])
    {
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
        Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        heading.setFont(f);

        TextField text1 = new TextField();
        TextField text2 = new TextField();
        TextField text3 = new TextField();
        TextField text4 = new TextField();
        TextField text5= new TextField();
        TextField text6 = new TextField();
        TextField text7 = new TextField();
        TextField text8 = new TextField();
        TextField text9 = new TextField();
        TextField text10= new TextField();
        TextField text11= new TextField();

        Button b1 = new Button("Convert");

        Button clear = new Button("Clear");
        Button aboutme = new Button("About me");
        Button exit = new Button("Exit");

        heading.setBounds(200,50,200,25);

        l1.setBounds(100,100,100,25);
        l2.setBounds(100,130,100,25);
        l3.setBounds(100,160,100,25);
        l4.setBounds(100,190,100,25);
        l5.setBounds(100,220,100,25);
        l6.setBounds(100,250,100,25);
        l7.setBounds(100,280,100,25);
        l8.setBounds(100,310,100,25);
        l9.setBounds(100,340,100,25);
        l10.setBounds(100,370,100,25);
        l11.setBounds(100,410,100,25);

        b1.setBounds(370, 100,100,25);

        
        text1.setBounds(210,100,100,25);
        text2.setBounds(210,130,100,25);
        text3.setBounds(210,160,100,25);
        text4.setBounds(210,190,100,25);
        text5.setBounds(210,220,100,25);
        text6.setBounds(210,250,100,25);
        text7.setBounds(210,280,100,25);
        text8.setBounds(210,310,100,25);
        text9.setBounds(210,340,100,25);
        text10.setBounds(210,370,100,25);
        text11.setBounds(210,410,100,25);

        clear.setBounds(100, 450, 100, 25);
        aboutme.setBounds(210,450,100,25);
        exit.setBounds(320,450,100,25);

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

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        win.setVisible(true);
        win.setBounds(0,0, 500, 500);
        win.show();

    }
}
