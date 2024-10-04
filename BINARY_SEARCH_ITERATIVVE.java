
public class BINARY_SEARCH_ITERATIVVE {
	public static void binary(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
			while(low<=high)
			{
				if(arr[mid]==key)
				{
					System.out.println("item is at "+mid);
					break;
				}
				else if(key>arr[mid])
				{
					low=mid+1;
				}
				else {
					high=mid-1;
				}
				mid=(low+high)/2;
			}
			if(low>high)
			{
				System.out.println("not found");
			}
			
		
	}
	
	public static void main(String[] args) {
		int arr[]= {10,15,30,70,80,60,20,90,40};
		binary(arr,80);

	}

}
