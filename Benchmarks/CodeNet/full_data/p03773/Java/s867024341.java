import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if ( a+b > 24 ) 
			System.out.println((a+b)-24);
		else if ( a+b == 24 )
			System.out.println(0);
		else
			System.out.println(a+b);
	}
}
