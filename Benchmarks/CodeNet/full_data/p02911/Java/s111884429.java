import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String in = sc.next();
//		String nkq[] = in.split(" ");
		int n = Integer.parseInt(sc.next());
		int kR = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		int[] np = new int[n];

		for(int i=0; i<q; i++) {
			int a = Integer.parseInt(sc.next());
			np[a-1]++;
		}

		for(int j=0; j<n; j++) {
			if(kR - q + np[j] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
