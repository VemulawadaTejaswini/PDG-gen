import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n, x;
			n = sc.nextInt();
			x = sc.nextInt();
			
			int count = 1;
			int p = 0;
			
			for (int i = 0; i < n; i++) {
				p += sc.nextInt();
				
				if (p <= x) count++;
			}
			
			System.out.println(count);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
