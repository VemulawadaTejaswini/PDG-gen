import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	
		//System.out.println(N);
		
		if (N%2 == 0) {
			System.out.println(N);
		} else {
			System.out.println(N*2);
		}
	}
}