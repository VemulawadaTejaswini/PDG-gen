import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S = sc.next();
	String s[] = S.split("");

	boolean bl = true;
	for (int i = 0; i < s.length; i++) {
	    if (i % 2 == 1) {
		if (s[i].equals("R")) {
		    bl = false;
		    break;
		}
	    } else {
		if (s[i].equals("L")) {
		    bl = false;
		    break;
		}
	    }
	}

	if (bl)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}