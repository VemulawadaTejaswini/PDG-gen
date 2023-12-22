import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println((int)kaijo(n));
	}

	static double kaijo(int m){
		double s = 0.0;
		for (int i1 = 1; i1 <= m; i1++)
			s += (double)i1;
			return s;
	}
}