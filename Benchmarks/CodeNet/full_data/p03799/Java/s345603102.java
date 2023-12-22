import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long scc = Math.min(n, m / 2);
		scc += Math.max(0, m - scc * 2) / 4;
		
		System.out.println(scc);
		
		sc.close();
	}
	
}

