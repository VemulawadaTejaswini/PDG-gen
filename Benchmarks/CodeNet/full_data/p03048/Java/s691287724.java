import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		long count = 0;
		for (int i = 0; i <= N/R; i++) {
			for (int j = 0; j <= (N-i*R)/G; j++) {
				for (int k = 0; k <= (N-i*R-j*G)/B; k++) {
					if (i*R+j*G+k*B == N) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}