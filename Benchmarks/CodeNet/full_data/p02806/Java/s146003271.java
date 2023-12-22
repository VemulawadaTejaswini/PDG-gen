import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		int[] arr1 = new int[n];
		for(int i=0;i<2*n;i++) {
			if(i%2==0) {
				arr[i/2]=sc.next();
			}
			else {
				arr1[i/2]=sc.nextInt();
			}
		}
		String x = sc.next();
		int sum=0;
		int d =0;
		for(int i=0;i<n;i++) {
			if(x.equals(arr[i])) {
				d=i;
				break;
			}
		}
		for( int y=d+1;y<n;y++) {
			sum=sum+arr1[y];
		}
		System.out.println(sum);
	}
}
