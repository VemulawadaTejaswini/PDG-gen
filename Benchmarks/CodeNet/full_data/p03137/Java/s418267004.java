import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] x = new int[m];
		int[] s = new int[m-1];
		x[0]=scn.nextInt();
		for(int i = 1;i<m;i++) {
			x[i]=scn.nextInt();
		}
		Arrays.sort(x);
		for(int i = 1;i<m;i++) {
			s[i-1] = x[i]-x[i-1];
		}
		Arrays.sort(s);
		int sum = 0;
		for(int i = 0;i<m-n;i++) {
			sum+=s[i];
		}
		System.out.println(sum);
	}
}