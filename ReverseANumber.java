//Program to reverse a given number
import java.util.Scanner;
class ReverseANumber {
	public static void main(String []args)
	{
		int remainder=0,reverse=0,number=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		number= input.nextInt();
		
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		System.out.println("The reverse is :"+reverse);
	}
}