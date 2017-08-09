// copy odd and even elements from an array into their respective arrays
import java.util.Scanner;
class CopyArray {
public static void main(String[]args)
{
int []arr1 = new int[5];

int []oddArr = new int[5];

int []evenArr = new int[5];

Scanner arrayin =new Scanner(System.in);

for(int i=0;i<arr1.length;i++)
{	
	System.out.println("Enter Element "+i);
	arr1[i]=arrayin.nextInt();
}	
for(int j =0;j<arr1.length;j++)
{
	if(arr1[j]%2==0)
	{
		evenArr[j]=arr1[j];
	}
	else
		oddArr[j]=arr1[j];
}

for(int a=0;a<evenArr.length;a++)
{
System.out.println("Elements of Even Array Are: "+evenArr[a]);
}

for(int b=0;b<oddArr.length;b++)
{
System.out.println("Elements of Odd Array Are: "+oddArr[b]);
}
}

}