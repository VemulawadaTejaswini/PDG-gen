import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] map = new int[N]; 
		int minus = 0;
		int puls = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			map[i] = x;
			if (x > 0) {
				puls++;
			} else {
				minus++;
			}
		}
		
		int[] m = new int[minus];
		int[] p = new int[puls];
		Arrays.sort(m);
		Arrays.sort(p);
		
		long[] ruisekiM = new long[minus];
		ruisekiM[0] = m[0];
		long[] ruisekiP = new long[puls];
		ruisekiP[0] = p[0];
		for (int i = 1; i < minus; i++) {
			ruisekiM[i] = ruisekiM[i - 1] + (long)m[i];
		}
		for (int i = 1; i < puls; i++) {
			ruisekiP[i] = ruisekiP[i - 1] + (long)p[i];
		}
		
		
		long min = Integer.MAX_VALUE;
		for (int i = 0; i < puls; i++) {
			long km = ruisekiP[i];
			
			if (K == (i+1) && !(K - (i+1) >= minus)) {
				min = Math.min(km, min);
				break;
			}
			
			int index = K - (i+1);
			km += Math.abs(ruisekiM[index]) + km;
			
			min = Math.min(km, min);
		}
		
		for (int i = 0; i < minus; i++) {
			long km = Math.abs(ruisekiM[i]);
			
			if (K == (i+1)) {
				min = Math.min(km, min);
				break;
			}
			
			int index = K - (i+1);
			km += ruisekiP[index] + km;
			
			min = Math.min(km, min);
		}
		
		System.out.println(min);
		
	}
}