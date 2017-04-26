/*

Swapping of two numbers 
without using third vaiable

*/

class Swap1
{
	public static void main(String as[])
	{
	int first_num,second_num;

	first_num=10;  // first number is 10
	second_num=20;	// second number is 20
	
	first_num	=	first_num+second_num;
	second_num	=	first_num-second_num;
	first_num	=	first_num-second_num;
	
	System.out.println("The First number is "+ first_num);
	System.out.println("The Second number is "+ second_num);
	
	}
}