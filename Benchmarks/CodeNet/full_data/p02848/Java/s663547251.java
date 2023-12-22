import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S = sc.next();
	char C[] = S.toCharArray();

	for (int i = 0; i < C.length; i++) {
	    if ((char)(C[i] + N) <= 'Z')
		System.out.print((char)(C[i] + N));
	    else {
		int M = (char)(C[i] + N) - 'Z' - 1;
		System.out.print((char)('A' + M));
	    }
	}
	System.out.println();
    }
}