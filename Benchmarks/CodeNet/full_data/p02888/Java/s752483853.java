import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), count=0;
		int[] length = new int[n];
		for(int i=0;i<n;i++) length[i]=sc.nextInt();
		Arrays.sort(length);
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				int mid=0, left=j+1,right=n-1, tar=length[i]+length[j];
				while(right-left>1) {
					mid = (left+right)/2;
					//if(left>=right || length[mid]==tar) break;
					if(length[mid]<tar) left = mid;
					else right=mid;
				}
				//if(length[mid]>=tar) mid--;
				count+=(left-j);
			}
		}
		System.out.println(count);
	}
}