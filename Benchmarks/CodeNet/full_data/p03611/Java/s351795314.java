import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[100000];
		for(int i = 0; i < n; i++) {
			b[sc.nextInt()]++;		
		}
		int max = 0;
		for(int i = 1; i < 99999; i++) {
			if(b[i-1]+b[i]+b[i+1] > max) {
				max = b[i-1]+b[i]+b[i+1];
			}
		}
		System.out.println(max);
	}
}