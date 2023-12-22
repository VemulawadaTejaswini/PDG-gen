import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long total = 0;
		long[] a = new long[3*n];
		for(int i=0; i<3*n; i++){
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for(int i=3*n-1; n<=i; i--){
			if(n%2==0){
				if(i%2==0){
					total = total + a[i];
				}
			}
			else{
				if(i%2==1){
					total = total + a[i];
				}
			}
		}
				System.out.println(total);
	}
}