import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B;
	A = sc.nextInt();
	B = sc.nextInt();

	int count = 0;
	int p = 1;
	while (p < B) {
	    p += A - 1;
	    count++;
	}

	System.out.println(count);
    }
}