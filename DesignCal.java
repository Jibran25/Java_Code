import java.awt.*;

public class DesignCal{
 
    public static void main(String args[])
    {
        Frame  win = new Frame();

        Label heading = new Label("Calculator");
        Label l1 = new Label("Enter Value");
        Label l2 = new Label("Result");

        TextField text1 = new TextField();
        TextField text2 = new TextField();

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");

        Button bAdd = new Button("+");
        Button bSubtract = new Button("-");
        Button bMultiply = new Button("*");
        Button bDivide = new Button("/");
        Button bModulus = new Button("%");
        Button bEquals = new Button("=");

        Button clear = new Button("Clear");
        Button aboutme = new Button("About me");
        Button exit = new Button("Exit");

        Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        heading.setFont(f);

        l1.setBounds(100,100,100,25);
        text1.setBounds(210,100,100,25);
        l2.setBounds(100,160,100,25);
        text2.setBounds(210,160,100,25);

        b7.setBounds(100,190,50,25);
        b8.setBounds(160,190,50,25);
        b9.setBounds(220,190,50,25);
        b4.setBounds(100,220,50,25);
        b5.setBounds(160,220,50,25);
        b6.setBounds(220,220,50,25);
        b1.setBounds(100,250,50,25);
        b2.setBounds(160,250,50,25);
        b3.setBounds(220,250,50,25);
        b0.setBounds(160,280,50,25);

        bAdd.setBounds(280,190,50,25);
        bSubtract.setBounds(340,190,50,25);
        bMultiply.setBounds(280,220,50,25);
        bDivide.setBounds(340,220,50,25);
        bModulus.setBounds(280,250,50,25);
        bEquals.setBounds(340,250,50,25);

        clear.setBounds(100, 310,100,25);
        aboutme.setBounds(220, 310,100,25);
        exit.setBounds(340, 310,100,25);
        heading.setBounds(220,50,200,25);
        

        win.setLayout(null);
        win.add(heading);
        win.add(l1);
        win.add(l2);

        win.add(text1);
        win.add(text2);

        win.add(b0);
        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);
        win.add(b5);
        win.add(b6);
        win.add(b7);
        win.add(b8);
        win.add(b9);

        win.add(bAdd);
        win.add(bSubtract);
        win.add(bMultiply);
        win.add(bDivide);
        win.add(bModulus);
        win.add(bEquals);

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        win.setBounds(0,0, 500, 400);
        win.show();

    }

}
