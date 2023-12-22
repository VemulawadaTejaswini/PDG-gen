import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = stdIn.nextInt();
			if(i > 0) {
				if(H[i] < H[i-1]) {
					H[i-1] -= 1;
				}
			}
		}
		boolean flag = true;
		
		for(int i = 0; i < N-1; i++) {
			if(H[i] > H[i+1]) {
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}

}