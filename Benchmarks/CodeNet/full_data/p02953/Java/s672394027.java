import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		
		long save = Long.parseLong(sc.next());
		
		long s = 1;
		
		for (int i=1; i<N; i++) {
			s = Long.parseLong(sc.next());
			
			if (s - save > 0) {
				save = s -1;
			}
			
			if (s - save < 0) {
				System.out.println("No");
				break;
			}
			
		}
		
		System.out.println("Yes");
		
		
		sc.close();

	}

}

