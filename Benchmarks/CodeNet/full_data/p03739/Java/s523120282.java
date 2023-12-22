import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		long ans = Math.min(count(n,a,0),count(n,a,1));
		
		System.out.println(ans);
		
		
	}
	private static long count(int n, int []a, int pat) {
		
		long count = 0;
		long sum = 0;
		sum += a[0];
		
		int temp = (int)Math.pow(-1, 1+pat);
		
		if(sum == 0) {
			count++;
			sum = temp;
		}
			
		for(int i = 1 ; i < n ; i++) {
			sum += a[i];
			temp *= -1;
			if((long)temp * sum <= 0) {
				count += Math.abs(sum) + 1 ;
				sum = temp;
			}
			
		}
		
		return count;
	}
}
