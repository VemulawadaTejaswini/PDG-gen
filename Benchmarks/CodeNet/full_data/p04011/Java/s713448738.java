import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	    int a = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());
	    int c = Integer.parseInt(sc.next());
	    int d = Integer.parseInt(sc.next());
	    if (a < b) {
	        System.out.println(a * c);
	    } else {
	        System.out.println((b * c) + ((a - b) * d));
	    }
    }
}
