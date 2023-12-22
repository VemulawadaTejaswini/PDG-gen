import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
	    long a = 0;
	    for (int i = 1; i <= line; i++) {
		    if (i % 3 != 0 && i % 5 != 0) {
		        a+= i;
		    }
		}
		System.out.println(a);
    }
}