import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); int m = sc.nextInt(); int s = 0;
		int[] a = new int[m];
		while (m-- > 0) {
			a[m] = sc.nextInt();
			s+=arr[m];
		}
			int v = n-s;
			System.out.println(v >= 0 ? vacation : "-1");
	}
}