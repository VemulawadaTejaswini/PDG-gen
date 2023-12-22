
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int []alp = new int [26];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				int m = s.charAt(j) - 'a';
				alp[m]++;
			}
		}
		
		if(h % 2 == 1 && w % 2 == 1) {
			for(int i = 0 ; i < 26 ;i++) {
				if(alp[i] % 4 == 1 || alp[i] % 4 == 3) {
					alp[i]--;
					break;
				}
			}
		}
		
		if(h % 2 == 1 || w % 2 == 1) {
			int m = 0;
			if(h % 2 == 1) {
				m += (h+1)/2;
			}
			if(w % 2 == 1) {
				m += (w+1)/2;
			}
			
			for(int i = 0 ; i < m ;i++) {
				f:for(int j = 0 ; j < 26 ;j++) {
					if(alp[j] % 4 == 2) {
						alp[j] -= 2;
						break f;
					}
				}
			}
		}
		
		int M = (w/2) * (h/2);
		for(int i = 0 ; i < M ;i++) {
			f:for(int j = 0 ; j < 26 ;j++) {
				if(alp[j] % 4 == 0 && alp[j] != 0) {
					alp[j] -= 4;
					break f;
				}
			}
		}
		
		for(int i = 0 ; i < 26 ;i++) {
			if(alp[i] != 0) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		
	}
}