import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	
	public void run() {
		
		String A = cin.next();
		String B = cin.next();
		String C = cin.next();
		
		System.out.println(A.charAt(0) +""+ B.charAt(0) +""+ C.charAt(0));
	}
}

