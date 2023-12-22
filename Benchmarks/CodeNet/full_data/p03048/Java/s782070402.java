import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int R = stdIn.nextInt();
		int G = stdIn.nextInt();
		int B = stdIn.nextInt();
		int N = stdIn.nextInt();
		
		int count = 0;
		for(int r = 0; r <= (N/R); r++) {
			for(int g = 0; g <= (N/G); g++) {
				for(int b = 0; b <= (N/B); b++) {
					if((r*R+g*G+b*B) == N) {
						count++;
					}
					else {
						
					}
				}
			}
		}
		System.out.println(count);

	}

}