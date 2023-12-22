import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int M = stdIn.nextInt();
		int D = stdIn.nextInt();
		int count = 0;
		if(D >= 22) {
			for(int i = 1; i <= M; i++) {
				for(int j = 22; j <= D; j++) {
					int temp = j;
					int d1 = temp%10;
					int d10 = temp/10;
					if(d1 >= 2 && d1 * d10 == i) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		else {
			System.out.println(0);
		}

	}

}