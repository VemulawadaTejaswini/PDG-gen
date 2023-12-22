import java.util.*;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		S += S;
		if (S.contains(T)) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}