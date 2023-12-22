import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B, C;
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();

	if (A == B) {
	    if (A == C)
		System.out.println("No");
	    else
		System.out.println("Yes");
	} else if (B == C) {
	    if (B == A)
		System.out.println("No");
	    else
		System.out.println("Yes");
	} else if (C == A) {
	    if (C == B)
		System.out.println("No");
	    else
		System.out.println("Yes");
	} else
	    System.out.println("No");

    }
}