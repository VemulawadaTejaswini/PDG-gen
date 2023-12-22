import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long a = s.nextLong();
		long b = s.nextLong();
		
		long result = a;
		
		for (long i = a + 1 ; i <= b ; i++) {
			
			result = result ^ i;
			
		}
		
		System.out.println(result);
		
		s.close();
		
	}

}