//selection sort
class SelectionSort{
	public static void main(String [] args)
	{
	
		int [] arr = new int[]{23,34,21,25,12};
		//int n=5;
		Sort(arr,5);
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int Sort(int[]arr,int n){
	for(int i =0;i<=n-1;i++)
		{
			int indexMinimum = i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<indexMinimum)
					indexMinimum=j;
				
			}
			int temp=arr[i];
			arr[i]=arr[indexMinimum];
			arr[indexMinimum]=temp;
	}}
}