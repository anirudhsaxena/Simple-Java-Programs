/*

	Swapping of two numbers
	by using third vaiable

*/

class Swap
{
	public static void main(String as[])
	{
	
	int first_num,second_num,temp;

	first_num=10;	// first number is 10
	second_num=20;	// second number is 20
	
	temp		=	first_num;
	first_num	=	second_num;
	second_num 	=	temp;
	System.out.println("The First number is "+ first_num);
	System.out.println("The Second number is "+ second_num);
	
	}
}