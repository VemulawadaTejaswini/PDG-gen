import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0;i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int p = 0;
		int q = 0;
		
		if(a[n-1] % 2 == 0) {
			p = a[n-1]/2;
			q = p;
		}
		else {
			p = (a[n-1] + 1)/2;
			q = (a[n-1] - 1)/2; 
		}
		int min = a[n-1] ;
		int b = 0;
		for(int i = 0; i < n ;i++) {
			if(min >= Math.abs(a[i] - p)){
				min = Math.abs(a[i] - p);
				b = p;
			}
			if(min >= Math.abs(a[i] - q)) {
				min = Math.abs(a[i] - q);
				b = q;
			}
		}
		
		System.out.println(a[n-1]+" "+(min+b));
	}
	

}
