import java.util.*;

public class SccPuzzle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		long c = sc.nextLong();
		long scc = 0;
		
		if(s>=c/2) {
			scc = c/2;
		}else {
			scc += s;
			c -= 2*s;
			scc += c/4;
		}
		
		System.out.println(scc);

	}

}
