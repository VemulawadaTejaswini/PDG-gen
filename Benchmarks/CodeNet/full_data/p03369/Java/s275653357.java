import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 700;

		if(s.substring(0,0).equals("o")) {
			sum += 100;
		}
		if(s.substring(1,1).equals("o")) {
			sum += 100;
		}

		if(s.substring(2,2).equals("o")) {
			sum += 100;
		}

		System.out.println(sum);


	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}


