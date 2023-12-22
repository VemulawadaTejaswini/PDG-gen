import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int sum = 0;
String re = "Yes";

		for(int i = 1;i <= n;i++) {
			int a = scan.nextInt();

			 sum += a;
			 if(i == n) {
				if(sum/(4*m) > a) {
					re = "No";
				}
		}
		}

		System.out.println(re);

		scan.close();

	}

}
