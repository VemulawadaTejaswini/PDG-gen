import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		long sum = 0;
		
		if(a[0] > x) {
			sum += a[0] - x;
			a[0] = x;
		}
		
		for (int i = 0; i < n - 1; i++) {
			if(a[i] + a[i+1] > x) {
				sum += (long) a[i] + a[i+1] - x;
				a[i+1] = x - a[i];
			}
		}
		
		System.out.println(sum);
		
	}

}
