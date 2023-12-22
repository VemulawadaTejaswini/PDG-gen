import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int ran = rand.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			if(a[i-1] - (ran+i) >= 0) {
				sum += a[i-1]-(ran+i);
			}else {
				sum += -(a[i-1]-(ran+i));
			}	
		}
		System.out.println(sum);

	}

}
