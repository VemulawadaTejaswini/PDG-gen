import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	double x;
	if (N % 2 == 0)
	    x = 1.0 / 2.0;
	else
	    x = (double)(N / 2 + 1) / (double)N;

	System.out.println(x);
    }
}