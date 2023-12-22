import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int t = 0;
		long n = N;
		while(n>0){
			t += n%10;
			n = n/10;
		}
		if (N%t == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
