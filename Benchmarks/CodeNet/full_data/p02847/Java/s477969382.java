import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		switch (s) {
		case "SUN":
			System.out.println(7);
			break;
		case "MON":
			System.out.println(6);
			break;
		case "TUE":
			System.out.println(5);
			break;
		case "WED":
			System.out.println(4);
			break;
		case "THU":
			System.out.println(3);
			break;
		case "FRI":
			System.out.println(2);
			break;
		case "SAT":
			System.out.println(1);
			break;
		}
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}
