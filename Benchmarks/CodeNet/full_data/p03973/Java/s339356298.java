import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long ans = a[0] - 1;
		int p = 2;
		
		for(int i=1; i<n; i++){
			if(a[i] != p){
				ans += (a[i]-1)/p;
			}else{
				p++;
			}
		}
		System.out.println(ans);
	}

}