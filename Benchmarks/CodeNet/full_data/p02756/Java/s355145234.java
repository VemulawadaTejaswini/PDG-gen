import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuilder S = new StringBuilder(sc.next());
		int Q = sc.nextInt();

		boolean hanten = false;
		for (int i=0; i<Q; i++) {
			int T = sc.nextInt();
			if (T == 1) {
				hanten = !hanten;
			}
			else {
				int F = sc.nextInt();
				String C = sc.next();
				if (F == 1 && !hanten || F == 2 && hanten) {
					S.insert(0, C);
				}
				else {
					S.append(C);
				}
			}
		}

		StringBuilder ans = new StringBuilder();
		if (hanten) {
			for (char s : S.toString().toCharArray()) {
				ans.insert(0, s);
			}
		}
		else {
			ans  = S;
		}
		
		System.out.println(ans);
	}
}