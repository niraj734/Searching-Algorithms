
public class LINEAR_SEARCH_RECURSIVE 
{
	public static int search(int arr[],int key,int i)
	{
		if(i==arr.length)
		{
			return -1;
			
		}
		if(arr[i]==key)
		{
			return i;
		}
		
		return search(arr,key,i+1);
	}

	public static void main(String[] args) {
		int arr[]= {10,25,30,70,80,60,20,90,40};
		System.out.println(search(arr,80,0));

	}

}
