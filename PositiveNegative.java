import java.util.*;
class PositiveNegative{
	public static void main(String jib[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	
	int num = sc.nextInt();

	if(num%4==0){
	System.out.println("Year is leapYear :"+num);		
	}	
	else{
	System.out.println("Year is not leapYear : "+num);
		}
	}
	
}