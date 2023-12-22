import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int c = sc.nextInt();
		int scc = 0;
		
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
