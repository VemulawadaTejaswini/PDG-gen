import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int a = Integer.parseInt(in);
		String in2 = sc.nextLine();
		int b = Integer.parseInt(in2);

		String in3 = sc.nextLine();
		String[] inArray = in3.split(" ");
		int answer = 0;
		for (int i = 0; i < inArray.length; i++) {
			int n = Integer.parseInt(inArray[i]);
			int min = Math.min(robotA(a,n), robotB(b,n));
			answer += min;
//			System.out.println(min);
		}
		System.out.println(answer);

	}

	private static int robotA(int a, int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			if (i < n) {
				res++;
			}
		}
//		System.out.println("RobotA:" + res);
		return res*2;
	}

	private static int robotB(int b, int n) {
		int res = 0;
		for (int i = b; i >= n; i--) {
			if (i > n) {
				res++;
			}
		}
//		System.out.println("RobotB:" + res);
		return res*2;
	}

}