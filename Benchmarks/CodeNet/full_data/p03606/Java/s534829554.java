import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		int total = 0;
		int a = 0;
		int b = 0;
		for ( int i = 0; i < n; i++ ) {
			a = in.nextInt();
			b = in.nextInt(); in.nextLine();
			total += (b-a+1);
		}
		
		System.out.println(total);
	}
}