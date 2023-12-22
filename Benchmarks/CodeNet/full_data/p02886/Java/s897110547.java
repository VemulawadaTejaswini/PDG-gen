import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int sum = 0;
		int [] a = new int[n];
		for(int i = 0;i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int [] b = new int[n*(n-1)/2];
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n && j>i+1; j++) {
				sum+=a[i]+a[j];
			}
		}
		
		System.out.println(sum);
		

	}

}
