import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		int A = sn.nextInt();
		int B = sn.nextInt();
		
		int cnt = 1;
		int Acnt = A;
		while (true) {
			if (Acnt >= B) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			
			Acnt -= 1;
			Acnt += A;
		}
		
	}
	
}
