import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int max=(int)-1e9;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int mid=n-1;
		while(mid>=1)
		{
			if(arr[mid]<arr[mid-1])
			{
				arr[mid-1]--;
			}
			mid--;
		}
//		System.out.println(Arrays.toString(arr));
		mid=0;
		while(mid<=arr.length-2)
		{
			if(arr[mid]>arr[mid+1])
			{
				System.out.println("No");
				System.exit(0);
			}
			mid++;
		}
		System.out.println("Yes");
	}
}