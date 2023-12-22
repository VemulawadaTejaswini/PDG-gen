import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt(), m = s.nextInt() - 1;
	    char[] cs = s.next().toCharArray();
	    //A - a = -32
	    cs[m] += ('a' - 'A');
	    System.out.println(cs);
    }
}