import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a = stdIn.nextInt();
		
		int nn = n % 500;
		if(a>=nn) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
