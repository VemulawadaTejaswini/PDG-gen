import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				if(i<(n-i)/i) {
					sum+=(n-i)/i;
				}
				else {
					System.out.print(sum);
					break;
				}
			}
		}

	}

}