import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S = sc.next();
	char[] c = S.toCharArray();

	int count = 0;
	for (int i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {
	    if (c[i] != c[j])
		count++;
	}

	System.out.println(count);
    }
}