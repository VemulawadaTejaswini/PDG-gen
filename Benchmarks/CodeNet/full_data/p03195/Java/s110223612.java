import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		//int[] d = new int[N];
		for(int i = 0;i < N;i ++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int d = 0;
		for(int i = 0;i < N-2;i ++) {
			d = a[i+1] - a[i];
		}
		int last = a[N-1] - a[0] - d;
		if(last % 2 == 0) System.out.println("second");
		else System.out.println("first");
	}
}