import java.util.*;

class loop2
{
    public static void main(String args[])
    {
        String even = "";
        String odd = "";
        for(int i=1; i<=10; i = i + 2)
        {
            odd += i + " ";
            even += ( i - 1) + " ";
            
    
            //String result = (i%2==0) ? "This Number is even "+i+(even+=i+" ") : "This number is odd "+i+(odd+=i+" ");
            System.out.println("This Number is even " +  ( i - 1));

            System.out.println("This Number is odd " + i);

        }
       
         System.out.println("Oddseries :"+ odd);
          System.out.println("Even series : "+even);

    }
}