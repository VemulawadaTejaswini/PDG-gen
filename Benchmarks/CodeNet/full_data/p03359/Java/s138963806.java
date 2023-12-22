import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int cnt = 0;
		
		
		for(int i = 1; i < a; i++) {
			cnt++;
		}
		
		if(b >= a) {
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
