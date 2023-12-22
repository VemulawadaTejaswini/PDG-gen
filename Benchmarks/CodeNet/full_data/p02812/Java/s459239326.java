import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S = sc.next();

	char[] C = S.toCharArray();
	char[] abc = {'A', 'B', 'C'};
	
	int count = 0;
	for (int i = 0, j = 0; i < N; i++) {
	    if (C[i] == abc[j]) {
		j++;
	    } else {
		j = 0;
	    }

	    if (j == 3) {
		count++;
		j = 0;
	    }
	}

	System.out.println(count);
    }
}