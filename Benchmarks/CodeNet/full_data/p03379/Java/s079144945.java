import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];	
		int xs[] = new int[n];
		
		for(int i = 0; i < n; i ++) {
			x[i] = sc.nextInt();
			xs[i] = x[i];
		}
		
		Arrays.sort(xs);
		
		int a = n / 2;
		int b = n / 2 - 1;
		
		for(int i = 0; i < n; i ++){
			if(x[i] <= xs[b]) {
				System.out.println(xs[a]);
			}else {
				System.out.println(xs[b]);
			}
		}
	}
}
