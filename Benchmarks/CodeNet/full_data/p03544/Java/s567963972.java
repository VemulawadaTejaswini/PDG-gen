import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		long[] l = new long[n+1];
		l[0] = 2;
		l[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			l[i] = l[i-2]+l[i-1];
		}
		System.out.println(l[l.length-1]);
		
		
	}

}
