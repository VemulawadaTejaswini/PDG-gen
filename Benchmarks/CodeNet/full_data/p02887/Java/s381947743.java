import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S = sc.next();

	int count = 0;
	String[] x = S.split("");
	for (int i = 0; i < N - 1; i++) {
	    if (x[i].equals(x[i + 1]))
		count++;
	}

	System.out.println(N - count);
    }
}