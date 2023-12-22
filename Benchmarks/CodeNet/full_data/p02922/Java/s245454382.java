import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B;
	A = sc.nextInt();
	B = sc.nextInt();

	int count = 1;
	while (A < B) {
	    count++;
	    A = (A * 2) - 1;
	}

	System.out.println(count);
    }
}