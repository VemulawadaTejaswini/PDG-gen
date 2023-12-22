import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int count = 0;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.next());
		}
		int A = 0;
		int B = 0;
		int Z = 0;
		int AB = 0;
		for (int i = 0; i < N; i++) {
			String s = list.get(i);
			for (int j = 0; j < s.length()-1; j++) {
				if (s.charAt(j) == 'A' && s.charAt(j+1) == 'B') {
					count++;
				}
			}
			if (s.charAt(s.length()-1) == 'A' && s.charAt(0) != 'B') {
				A++;
			}
			if (s.charAt(0) == 'B' && s.charAt(s.length()-1) != 'A') {
				B++;
			}
			if (s.charAt(s.length()-1) == 'A' && s.charAt(0) == 'B') {
				Z++;
			}
		}
		if (!(A == 0 && B == 0 && (Z > 0))) {
//			System.out.println(A);
//			System.out.println(B);
//			System.out.println(Z);
			AB = Math.min(A+Z, B+Z);
		} else {
			AB = Math.min(A, B);
		}
		int ans = count + AB;
		System.out.println(ans);
	}
}
