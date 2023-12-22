import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();
		long res = 0;
//		String s = sc.next();
//		String res = "";
		long semiFinal1 = n % k;
		long semiFinal2 = k - semiFinal1;
//		System.out.printf("%d %d\n", semiFinal1, semiFinal2);

		if(semiFinal1 < semiFinal2) {
			res = semiFinal1;
		} else {
			res = semiFinal2;
		}
		System.out.printf("%d", res);
		//System.out.println(res);
	}
}
