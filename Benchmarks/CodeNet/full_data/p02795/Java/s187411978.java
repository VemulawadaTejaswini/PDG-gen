
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long n = sc.nextLong();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if (h*w-(h-i+j)*(w-j)>=n) {
					System.out.println(i);
					return;
				}
			}
		}
	}

}
