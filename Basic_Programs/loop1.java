import java.util.*;

class loop1
{
    public static void main(String args[])
    {
        String even = "";
        String odd = "";
        for(int i=1; i<=10; i++)
        {
            
            if(i%2==0)
            {
                
                System.out.println("This Number is Even :" + i);
                even +=i+ " ";
                
            }
            else
            {
                System.out.println("This Number is odd :"+ i);
                odd +=i+ " ";
            } 

        }
        System.out.println("Even series :"+ even);
        System.out.println("Oddseries :"+ odd);

    }
}