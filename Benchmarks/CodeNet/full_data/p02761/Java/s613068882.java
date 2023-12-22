import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int s[] = new int[M];
		int c[] = new int[M];
		for(int i =0; i < M; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int R = 0;
		int R_1 = 0;
		int R_2 = 0;
		int R_3 = 0;
		for(int i = 0; i < M; i++) {
			if(N != 1 && s[i] == 1 && c[i] == 0) {
				R = -1;
				break;
			}
			if(R_1 != 0 && s[i] == 1 && R_1 !=c[i]) {
				R = -1;
				break;
			}
			if(R_2 != 0 && s[i] == 2 && R_2 !=c[i]) {
				R = -1;
				break;
			}
			if(R_3 != 0 && s[i] == 3 && R_3 !=c[i]) {
				R = -1;
				break;
			}
			if(s[i] == 1) {
				R_1 = c[i];
			}
			if(s[i] == 2) {
				R_2 = c[i];
			}
			if(s[i] == 3) {
			R_3 = c[i];	
			}
		}
		if(R != -1) {
			if(N == 3 && R_1 == 0) {
				R = 100 + R_2 * 10 + R_3;
			}
			else if(N == 3) {
				R = R_1 * 100 + R_2 * 10 + R_3;
			}
			else if(N == 2 && R_1 == 0) {
				R = 10 + R_3;
			}
			else if(N == 2) {
				R = R_1 * 10 + R_2;
			}
			if(N == 1) {
					R = R_1;
			}
		}
		System.out.println(R);
	}
}