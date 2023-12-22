import java.util.*;


class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		int ab = Integer.parseInt(a + b);

		double result = Math.sqrt(ab);

		if (Math.floor(result) - result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}