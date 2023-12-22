import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S[] = new String[N];
		int P[] = new int[N];

		for (int i=0; i<N; i++){
			S[i] = sc.next();
			P[i] = sc.nextInt();
		}

		Set<Integer> printed = new HashSet<Integer>();
		for (int i=0; i<N; i++){
			String tempS = "zzzzzzzzzz";
			int tempP = 0;
			int tempIndex = 0;
			for (int j=0; j<N; j++){
				if (!printed.contains(j)) {
					if (tempS.compareTo(S[j]) > 0 || (tempS.compareTo(S[j]) == 0 && tempP < P[j])){
						tempS = S[j];
						tempP = P[j];
						tempIndex = j;
					}
				}
			}
			System.out.println(tempIndex + 1);
			printed.add(tempIndex);
		}


	}
}