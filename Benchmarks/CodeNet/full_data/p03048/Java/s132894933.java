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
			if(r*R == N) {
				count++;
				break;
			}
			for(int g = 0; g <= ((N-r*R)/G); g++) {
				if((r*R+g*G) == N) {
					count++;
					break;
				}
				else if((N-r*R-g*g)/B == (int)((N-r*R-g*g)/B)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

}