import java.util.*;

public class Main {

	public static void main(String[] argv) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
	
		
		int number;
		if(d>=m)number= m;
		else number = m-1;
		
		System.out.println(number);
	}
}
