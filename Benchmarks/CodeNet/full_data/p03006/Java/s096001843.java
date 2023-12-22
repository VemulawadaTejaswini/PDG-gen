import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		
		int[]X = new int[N];
		int[]Y = new int[N];

		
		for(int i = 0; i < N; i++) {
				X[i] = keyboard.nextInt();
				Y[i] = keyboard.nextInt();
		}
		
		int[]Xsa = new int[N-1];
		int[]Ysa = new int[N-1];
		int[][] map = new int[120][120];
		int ans = 0;
		
		if(N != 1) {
			for(int i = 0; i < N-1; i++) {
				Xsa[i] = X[i+1]-X[i];
				Ysa[i] = Y[i+1]-Y[i];
			}
		
			for(int i = 0; i < N-1; i++) {
				if(map[Xsa[i]+50][Ysa[i]+50] == 0) {
					ans +=1;
					map[Xsa[i]+50][Ysa[i]+50] += 1; 
				}
			}
		}else {
			ans = 1;
		}

		System.out.println(ans);
		keyboard.close();	
	}
}
