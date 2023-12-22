import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, M;
	N = sc.nextInt();
	M = sc.nextInt();
	int p[] = new int[M];
	String S[] = new String[M];
	for (int i = 0; i < M; i++) {
	    p[i] = sc.nextInt();
	    S[i] = sc.next();
	}

	boolean bl[] = new boolean[N];
	for (int i = 0; i < N; i++) {
	    bl[i] = false;
	}

	int correct = 0;
	int penalty = 0;
	for (int i = 0; i < M; i++) {
	    if (!bl[p[i] - 1] && S[i].equals("AC")) {
		correct++;
		bl[p[i] - 1] = true;
	    } else if (!bl[p[i] - 1] && S[i].equals("WA")) {
		penalty++;
	    }
	}

	System.out.println(correct + " " + penalty);
    }
}