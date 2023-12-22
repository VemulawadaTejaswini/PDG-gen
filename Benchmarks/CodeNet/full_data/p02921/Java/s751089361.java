import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S = sc.next();
	String s[] = S.split("");
	String T = sc.next();
	String t[] = T.split("");

	int count = 0;
	for (int i = 0; i < 3; i++) {
	    if (s[i].equals(t[i]))
		count++;
	}

	System.out.println(count);
    }
}