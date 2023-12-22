import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int L = scan.nextInt();
			
			int[] a = new int[N];
			int max = 0;
			
			a[0] = scan.nextInt();
			for(int i = 1; i<N; i++){
				a[i] = scan.nextInt();
				if(a[i-1] + a[i] > a[max] + a[max+1]){
					max = i-1;
				}
			}
			
			if(a[max] + a[max+1] < L){
				System.out.println("Impossible");
				return;
			}
			
			System.out.println("Possible");			
			
			for(int i = 0; i<max; i++){
				System.out.println(i+1);
			}
			
			for(int i = N-2; i>=max; i--){
				System.out.println(i+1);				
			}
		}
	}
}
