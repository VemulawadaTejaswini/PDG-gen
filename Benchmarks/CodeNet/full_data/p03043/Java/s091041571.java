import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int len = k/n;
		double sum = 0;
		if(n > k) {
			for(int i=1; i<=(k/2)+1; i++) {
				sum += 1/(n * Math.pow(2, i+1));
			}
			System.out.println(sum + (double)(n-k)/n);
			return;
		}else {
			for(int i=1; i<=len; i++) {
				sum += 1/(n * Math.pow(2, i+1));
			}
		}
		
		System.out.println(sum);
	}
}
