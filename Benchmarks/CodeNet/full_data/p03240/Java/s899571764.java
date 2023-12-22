import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[][] P = new int[N][3];
		for(int i = 0; i < N; i++) {
			P[i][0] = stdIn.nextInt();
			P[i][1] = stdIn.nextInt();
			P[i][2] = stdIn.nextInt();
		}
		
		LABEL: for(int x = 0; x <= 100; x++) {
			for(int y = 0; y <= 100; y++) {
				boolean flag = true;
				int H = 0;
				int temp = 0;
				for(int i = 0; i < N; i++) {
					if(P[i][2] > 0) {
						H = P[i][2]+Math.abs(P[i][0]-x)+Math.abs(P[i][1]-y);
						temp = i;
						break;
					}
				}
				for(int j = temp; j < N; j++) {
					if(Math.max(H-Math.abs(P[j][0]-x)-Math.abs(P[j][1]-y),0) != P[j][2]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(x+ " " +y+ " " +H);
					break LABEL;
				}
			}
		}

	}

}