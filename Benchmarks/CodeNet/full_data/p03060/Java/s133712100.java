import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] v = new int[n];
		Integer[] r = new Integer[n];
		int sum=0;
		for (int i = 0; i < n; i++) {
			v[i]=scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			r[i] = v[i] - scn.nextInt();
		}
		Arrays.sort(r,Comparator.reverseOrder());
		for(int i=0;i<n;i++) {
			if(r[i]>0) {
				sum+=r[i];
			}else {
				break;
			}
		}
		System.out.println(sum);
	}
}