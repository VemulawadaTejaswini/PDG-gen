import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	String S[] = new String[N];
	char C[][] = new char[N][10];
	String Sort_S[] = new String[N];
	for (int i = 0; i < N; i++) {
	    S[i] = sc.next();
	    C[i] = S[i].toCharArray();
	}

	for (int i = 0; i < N; i++) {
	    Arrays.sort(C[i]);
	    Sort_S[i] = new String(C[i]);
	}
	Arrays.sort(Sort_S);

	int count[] = new int[N];
	long sum = 0;
	for (int i = 0; i < N - 1; i++) {
	    for (int j = i + 1; j < N; j++) {
		if (Sort_S[i].equals(Sort_S[j])) {
		    count[i]++;
		} else {
		    break;
		}
	    }
	    sum += count[i];
	}

	System.out.println(sum);
    }
}