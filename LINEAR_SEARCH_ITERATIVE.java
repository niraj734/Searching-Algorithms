
public class LINEAR_SEARCH_ITERATIVE 
{
	public static int linear(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,15,30,70,80,60,20,90,40};
		int key=80;
		int pos=linear(arr,key)+1;
		if(linear(arr,key)==-1)
		{
			System.out.println("not found");
		}
		else
			
		{
			System.out.println("found at pos "+pos);
		}
		// TODO Auto-generated method stub

	}

}
