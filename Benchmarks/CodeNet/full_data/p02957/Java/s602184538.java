import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
//		String s = sc.next();
		int i = 0;
		if(A%2 != B%2) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		while(true) {

			if(Math.abs(A-i)==Math.abs(B-i))break;

			i++;
		}

		System.out.println(i);


	}

}
