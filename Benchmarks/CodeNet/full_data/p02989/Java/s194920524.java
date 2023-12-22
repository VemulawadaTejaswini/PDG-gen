import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] d = new int[n];
		for(i=0;i<n;i++) {
			d[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(d);
		System.out.println(d[n/2]-d[n/2-1]);
	}
}
