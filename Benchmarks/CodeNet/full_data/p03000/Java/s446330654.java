import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] l = new int[n];
		for(i=0;i<n;i++) {
			l[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int d = 0;
		for(i=0;i<n;i++) {
			d+=l[i];
			if(d>x) break;
		}
		System.out.println(i+1);
	}
}
