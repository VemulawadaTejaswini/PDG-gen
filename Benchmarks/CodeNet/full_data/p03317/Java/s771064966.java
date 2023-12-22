import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			s.nextInt();
		}
		
		int num = (n - 1) / (k - 1);
		if ((n - 1) % (k - 1) != 0) {
			num++;
		}
		System.out.println(num);
	}

}
