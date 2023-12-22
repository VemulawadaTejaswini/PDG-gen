import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, K, Q;
	N = sc.nextInt();
	K = sc.nextInt();
	Q = sc.nextInt();

	int A[] = new int[Q];
	for (int i = 0; i < Q; i++) {
	    A[i] = sc.nextInt();
	}

	int X[] = new int[N];
	for (int i = 0; i < N; i++)  {
	    X[i] = K - Q;
	}
	for (int i = 0; i < Q; i++) {
	    X[A[i]]++;
	}

	for (int i = 1; i < N; i++) {
	    if (X[i] > 0)
		System.out.println("Yes");
	    else
		System.out.println("No");
	}
        if (X[0] > 0)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}