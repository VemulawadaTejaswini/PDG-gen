import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long count=0;
		int[] length = new int[n];
		for(int i=0;i<n;i++) length[i]=sc.nextInt();
		Arrays.sort(length);
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				if(length[n-1]<length[i]+length[j]) count+=(n-j-1);
				else {
					int mid, left=j+1,right=n-1, tar=length[i]+length[j];
					while(true) {  //2分探索
						mid = (left+right)/2;
						if(length[mid]==tar || left==mid) break;
						if(length[mid]<tar) left = mid+1;
						else right=mid-1;
					}
					if(length[mid]>=tar) mid--;
					count+=mid-j;
				}
			}
		}
		System.out.println(count);
	}
}