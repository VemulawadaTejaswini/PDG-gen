import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] l = new long[n + 1];
		l[0] = 2;
		l[1] = 1;
		for(int i = 2 ; i <= n ; i++) {
			l[i] = l[i - 1] + l[i - 2];
		}
		System.out.println(l[n]);
	}
}