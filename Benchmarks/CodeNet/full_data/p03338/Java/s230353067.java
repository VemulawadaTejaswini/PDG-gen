import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		
		String Ss[] = S.split("");
		int max = 0;

		for (int i = 0; i < N; i++){
			
			Set<String> tmpA = new HashSet<String>();
			Set<String> tmpB = new HashSet<String>();
			
			for (int j = 0; j < i; j++) {
				tmpA.add(Ss[j]);
			}
			
			for (int j = i; j < N - i; j++) {
				tmpB.add(Ss[j]);
			}
			
			tmpA.retainAll(tmpB);
			
			if (max < tmpA.size()) {
				max = tmpA.size();
			}

		}

		System.out.println(max);

	}
}