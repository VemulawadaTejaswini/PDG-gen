import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		for(int i = 10; i < 1010; i++) {
			if((int)(i * 0.08) == a && (int)(i*0.1) == b) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
		
	}

}
