/*

Program to find
Perfect Number

*/

class PerfectNumber
{
	public static void main(String arr[])
	{
		int number =28;
		boolean b = isPerfect(n);
		
		if (b)
		System.out.println("It is a Perfect Number");
		
		else 
		System.out.println("Not a Perfect number");
	}
	
	public static boolean isPerfect(n)
	{
		int sum = 0;
		for(int i =1;i<=number;i++)
		{
			if(number % i==0)
			Sum=Sum+i;
		
		}
		
		if(number =Sum)
		return true;
		
		else
		return false;
	}
}