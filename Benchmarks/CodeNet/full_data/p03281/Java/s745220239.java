
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for (int i=1;i<=n;i+=2) {
			int uoc = 0;
			for (int j=1;j<=n;j++) {
				if (i%j==0) uoc++;
			}
			if (uoc==8) count++;
		}
		System.out.println(count);
	}
}
