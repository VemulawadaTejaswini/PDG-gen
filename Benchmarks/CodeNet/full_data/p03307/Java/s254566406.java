import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = n; ; i++) {
			if(i % 2 == 0 && i % n == 0 ) {
				System.out.println(i);
				break;
			}
		}
      scan.close();
	}
}
