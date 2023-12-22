import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	int count = 1;
	char mae = s.charAt(0);
	for (int i=1; i<n; i++) {
	    if (s.charAt(i) != mae) {
		count++;
		mae = s.charAt(i);
	    }
	}
	System.out.print(count);
    }
}
