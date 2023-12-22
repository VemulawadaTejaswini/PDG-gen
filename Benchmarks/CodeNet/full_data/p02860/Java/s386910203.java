import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int l = s.length();

		if (l % 2 == 1) {
			System.out.println("No");
			return;

		}

		int mid = l /2;

		String sub = s.substring(0, mid);
		String after = s.substring(mid, l);


		if(sub.equals(after)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}