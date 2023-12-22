import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int X[] = new int[N];
	int min = 0;
	for (int i = 0; i < N; i++) {
	    X[i] = sc.nextInt();
	    min += (X[i] - 1) * (X[i] - 1);
	}

	int count = 0;
	for (int i = 2; i < 101; i++) {
	    for (int j = 0; j < N; j++) {
		count += (X[j] - i) * (X[j] - i);
	    }

	    if (min > count)
		min = count;

	    count = 0;
	}

	System.out.println(min);
    }
}