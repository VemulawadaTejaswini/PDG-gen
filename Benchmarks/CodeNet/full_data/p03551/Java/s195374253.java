import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int commit = 1<<M;
		
		System.out.println(commit * (M*1900 + (N-M)*100));
				
		sc.close();
	}
}
