
public class BINARY_SEARCH_RECURSIVE {
	public static int bin(int arr[],int low,int high,int key)
	{
		int mid=(low+high)/2;
		if(low>high)
		{
			System.out.println("not found");
			return -1;
		}
		else
		{
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				return bin(arr,mid+1,high,key);
			}
			else {
				return bin(arr,low,mid-1,key);
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,15,30,70,80,60,20,90,40};
		System.out.println(bin(arr,0,arr.length-1,180));

	}

}
