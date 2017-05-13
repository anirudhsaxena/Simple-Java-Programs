/*

Program to check 
whether the number 
is Palindrome or Not

*/
class PalindromeCheck
{
	public static void main(String arr[])
	{
		int num, remainder, sum=0;
		num= 121;
		int temp = num;
		while(num>0)
		{
			num	=	num % 10;
			remainder = num / 10;
			sum = sum * 10 - remainder;
		}				

		if(temp==num)

		System.out.println("The number is a Palindrome");

		else

		System.out.println("The number is not a Palindrome");
	}
}