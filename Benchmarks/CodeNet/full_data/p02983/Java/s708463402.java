import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int L = (int)(sc.nextLong() % 2019);
		int R = (int)(sc.nextLong() % 2019);
		int min = Integer.MAX_VALUE;
		if(L < R) {
			for(int i = L; i <= R - 1; i++) {
				for(int j = i + 1; j <= R; j++) {
					min = Math.min(min, (i * j) % 2019);
				}
			}
		}
		else {
			for(int i = 0; i <= 2018; i++) {
				if(i <= R || L <= i) {
					for(int j = 1; j <= 2019; j++) {
						if(j <= R || L <= j) {
							min = Math.min(min, (i * j) % 2019);
						}
					}
				}
			}
		}
		System.out.println(min);
	}
}