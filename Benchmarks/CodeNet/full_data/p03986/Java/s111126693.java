import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		int idx = sb.indexOf("ST");
		while (idx >= 0) {
		    sb.delete(idx, idx + 2);
		    idx = sb.indexOf("ST");
		}
		System.out.println(sb.length());
	}

}
