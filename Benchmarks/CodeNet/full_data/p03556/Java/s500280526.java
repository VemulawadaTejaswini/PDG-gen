
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res = 0;

	public static void main(String[] args) throws Exception {


		int k=sc.nextInt();
		

		System.out.println(helper(k));

	}

	private static int helper(int k) {
		// TODO Auto-generated method stub
		int n=(int) Math.sqrt(k);
		return n*n;
	}

}