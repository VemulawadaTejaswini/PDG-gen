import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int M = keyboard.nextInt();
		
		int[]den = new int[M]; 
		for(int i = 0; i<M; i++) {
			int K = keyboard.nextInt();
			for(int j =0; j<K; j++) {
				int S = keyboard.nextInt();
				den[i] += 1 << (S - 1);
			}
		}
		
		int[]amari = new int[M]; 
		for(int k = 0; k<M; k++) {
			amari[k] = keyboard.nextInt();
		}
		
		int ans = 0;
		for(int l = 0; l<(1<<N); l++) {
			boolean flag = true;
			for(int m = 0; m<M; m++) {
				if(amari[m] != Integer.bitCount(den[m]&l)%2) {
					flag = false;
					break;
				}
			}
			if(flag) {
				ans++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
