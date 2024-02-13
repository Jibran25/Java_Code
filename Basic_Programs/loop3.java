import java.util.*;

class loop3
{
    public static void main(String args[])
    {
        String s = "*****";
        String tem="";
        for(int j=1; j<=5; j++)
        {
            // i+=j;
            System.out.print(j);
            // i+=j;
            // System.out.println(i);
            // String s="hello";    
            System.out.println(s.substring(0,j));

            tem+=j+(s.substring(0,j));
            
        }

         System.out.println(""+ tem);
        //   System.out.println("Even series : "+even);

    }
}