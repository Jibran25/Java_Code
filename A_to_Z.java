import java.awt.*;

public class A_to_Z{
 
    public static void main(String args[])
    {
        Frame  win = new Frame();

        Label heading = new Label("ABC APP");

        Button bA = new Button("A");
        Button bB = new Button("B");
        Button bC = new Button("C");
        Button bD = new Button("D");
        Button bE = new Button("E");
        Button bF = new Button("F");
        Button bG = new Button("G");
        Button bH = new Button("H");
        Button bI = new Button("I");
        Button bJ = new Button("J");
        Button bK = new Button("K");
        Button bL = new Button("L");
        Button bM = new Button("M");
        Button bN = new Button("N");
        Button bO = new Button("O");
        Button bP = new Button("P");
        Button bQ = new Button("Q");
        Button bR = new Button("R");
        Button bS = new Button("S");
        Button bT = new Button("T");
        Button bU = new Button("U");
        Button bV = new Button("V");
        Button bW = new Button("W");
        Button bX = new Button("X");
        Button bY = new Button("Y");
        Button bZ = new Button("Z");
        Button abcZ = new Button("ABC SONG");

        Button clear = new Button("Clear");
        Button aboutme = new Button("About me");
        Button exit = new Button("Exit");

        Font f = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        heading.setFont(f);

        heading.setBounds(220,50,200,25);

        bA.setBounds(100,100,50,25);
        bB.setBounds(160,100,50,25);
        bC.setBounds(220,100,50,25);
        bD.setBounds(280,100,50,25);
        bE.setBounds(340,100,50,25);
        bF.setBounds(100,130,50,25);
        bG.setBounds(160,130,50,25);
        bH.setBounds(220,130,50,25);
        bI.setBounds(280,130,50,25);
        bJ.setBounds(340,130,50,25);
        bK.setBounds(100,160,50,25);
        bL.setBounds(160,160,50,25);
        bM.setBounds(220,160,50,25);
        bN.setBounds(280,160,50,25);
        bO.setBounds(340,160,50,25);
        bP.setBounds(100,190,50,25);
        bQ.setBounds(160,190,50,25);
        bR.setBounds(220,190,50,25);
        bS.setBounds(280,190,50,25);
        bT.setBounds(340,190,50,25);
        bU.setBounds(100,220,50,25);
        bV.setBounds(160,220,50,25);
        bW.setBounds(220,220,50,25);
        bX.setBounds(280,220,50,25);
        bY.setBounds(340,220,50,25);
        bZ.setBounds(100,250,50,25);
        abcZ.setBounds(160,250,100,25);

        clear.setBounds(100, 310,100,25);
        aboutme.setBounds(220, 310,100,25);
        exit.setBounds(340, 310,100,25);

        win.setLayout(null);
        win.add(heading);

        win.add(bA);
        win.add(bB);
        win.add(bC);
        win.add(bD);
        win.add(bE);
        win.add(bF);
        win.add(bG);
        win.add(bH);
        win.add(bI);
        win.add(bJ);
        win.add(bK);
        win.add(bL);
        win.add(bM);
        win.add(bN);
        win.add(bO);
        win.add(bP);
        win.add(bQ);
        win.add(bR);
        win.add(bS);
        win.add(bT);
        win.add(bU);
        win.add(bV);
        win.add(bW);
        win.add(bX);
        win.add(bY);
        win.add(bZ);
        win.add(abcZ);

        win.add(clear);
        win.add(aboutme);
        win.add(exit);

        win.setBounds(0,0, 500, 400);
        win.show();

    }

}
