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

	long sum = 0;
	int count = 0;
	for (int i = 1; i < N; i++) {
	    if (Sort_S[i - 1].equals(Sort_S[i])) {
		count++;
	    } else {
		sum += count * (count + 1) / 2;
		count = 0;
	    }
	}
	sum += count * (count + 1) / 2;
	System.out.println(sum);
    }
}