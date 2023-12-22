import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int []x = new int [n];
		
		for(int i = 0; i < n ; i++) {
			x[i] = sc.nextInt();
		}
		int now = x[0];
		
		long sum = 0;
		
		for(int i = 1 ; i < n ; i++) {
			int temp = x[i] - now;
			if(a * temp > b) {
				sum += b;
			}
			else {
				sum += (long) a * temp;
			}
			now = x[i];
		}
		System.out.println(sum);

	}

}
