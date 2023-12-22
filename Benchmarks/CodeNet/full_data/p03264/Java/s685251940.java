import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int sol = 0;
	for (int i = 1; i <= a; i++) {
	    for (int j = 1; j<= a; j++) {
		if (i%2 == 0 && j%2 != 0)
		    sol++;
	    }
	}
	System.out.println(sol);
    }
}
