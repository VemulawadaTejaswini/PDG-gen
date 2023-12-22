
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i+1;j--) {
				int idx=binarySearch(i+1,j-1,arr,i,j);
				if(idx!=-1) {
					count+=j-idx;
				}
				//System.out.println(j+" idx   "+idx);
			}
			//System.out.println(count);
		}
		System.out.println(count);
		
	}
	public static int binarySearch(int i, int j, int []arr, int left , int right) {
		if(i==j ) {
			//System.out.println(i+" "+j+" "+left+" "+right);
			if(arr[left]+arr[i]>arr[right]) {
				//System.out.println("ppp");
				return i;

			}
			else {
				return -1;
			}
		}
		//System.out.println(i+" "+j+" "+left+" "+right);
		int mid=(i+j)/2,x=0;
		if(arr[left]+arr[mid]>arr[right]) {
			if(i>mid-1)
				return mid;
			return ((x=binarySearch(i,mid-1,arr,left,right))==-1)?mid:x;
		}else {
			return binarySearch(mid+1,j,arr,left,right);
		}
	}
}
