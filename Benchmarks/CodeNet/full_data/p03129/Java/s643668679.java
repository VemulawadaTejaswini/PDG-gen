import java.util.*;

public class Main{
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int number = N/2;
		
		if ((N%2)==1) {
			number++;
		}
		if(number>=K) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}