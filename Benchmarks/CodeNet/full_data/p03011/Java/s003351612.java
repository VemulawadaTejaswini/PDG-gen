import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int p = stdIn.nextInt();
		int q = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		int a = p+q;
		int b = q+r;
		int c = p+r;
		
		int min = Integer.MAX_VALUE;
		min = Math.min(a, b);
		min = Math.min(min, c);
		
		System.out.println(min);
		
		
		
		
		
	}

}
