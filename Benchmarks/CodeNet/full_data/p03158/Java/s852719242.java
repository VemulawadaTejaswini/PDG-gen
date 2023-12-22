
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int q=scn.nextInt();
		int []arr=new int[n];
		long []alt_even=new long[n/2+1];
		long []alt_odd=new long[n/2+1];
		long tot=0;
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			tot+=arr[i];
			if(i%2==0) {
				if(i/2>0)
				alt_even[i/2]=alt_even[i/2-1]+arr[i];
				else 
					alt_even[i]=arr[i];
			}else {
				alt_odd[i-1]=i-2>=0?alt_odd[i-2]+arr[i]:arr[i];

			}
		}
		long []split_sum=new long[n];
		long temp=arr[0];
		for(int i=1;i<n;i++) {
			split_sum[i-1]=tot-temp;
			temp+=arr[i];

		}
		for(int i=0;i<q;i++) {
			int x=scn.nextInt();
			int idx=binarySearch(0,arr.length-1,arr,x);
			//System.out.println(idx);
			if(idx<n/2) {
				System.out.println(split_sum[n/2-1]);
			}else {
				int y=n-1-idx;
				if((idx-y)%2==0) {
					System.out.println(alt_even[idx-y>0?idx-y-1:idx-y]+split_sum[idx]);
				}else {
					System.out.println(alt_odd[idx-y>0?idx-y-1:idx-y]+split_sum[idx]);
				}
			}
		}
	}
	
	public static int binarySearch(int i,int j,int []arr,int ele) {
		if(i>j) {
			if(j==arr.length) {
				return j-2;
			}
			return j;
		}
		if(i==j) {
			return i;
		}
		if(j-i==1) {
			if(ele-arr[i]<=arr[j]-ele) {
				//System.out.println(i);
				return i;
			}else {
				return j;
			}
		}
		int mid=(i+j)/2;
		int x=mid;
		if(arr[mid]<ele) {
			x=binarySearch(mid,j,arr,ele);
		}else if(arr[mid]>ele) {
			x=binarySearch(i,mid,arr,ele);
		}
		return x==arr.length-1?x-1:x;
	}

}
