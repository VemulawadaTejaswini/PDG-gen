import java.util.Scanner;

// B - *e**** ********e* *e****e* ****e**
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String s = sc.next();
	String[] S = s.split("");
	int K = sc.nextInt();
	String mozi = S[K-1];
	for (int i = 0; i < N; i++) {
		if (!mozi.equals(S[i])) {
			S[i] = "*";
		}
	}

	for (int i = 0; i < N; i++) {
		System.out.print(S[i]);
	}
	}
}