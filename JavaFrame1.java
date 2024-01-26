import javax.swing.*;
import java.awt.*;

public class JavaFrame1 {
    public static void main(String[] args) {
       Frame obj = new Frame("Buttons");

       Button b1 = new Button("RED");
       b1.setBounds(100,100,100,25);
        // b1.setBackground(color.red);
       obj.setBounds(100,100,500,500);
       obj.setLayout(null);
       obj.add(b1);

    //    obj.setVisible(true);
    obj.show();
    }

   
}
