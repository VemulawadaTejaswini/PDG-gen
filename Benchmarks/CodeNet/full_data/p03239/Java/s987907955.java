import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int T = in.nextInt();
		int[] c = new int[n];
		int[] t = new int[n];
		int minIdx = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			c[i] = in.nextInt();
			t[i] = in.nextInt();
			if(t[i]<=T && c[i]<min) {
				min = c[i];
				minIdx = i;
			}
		}
		if(min>1000) {
			System.out.println("TLE");
		}else {
			System.out.println(min);
		}

	}

}
