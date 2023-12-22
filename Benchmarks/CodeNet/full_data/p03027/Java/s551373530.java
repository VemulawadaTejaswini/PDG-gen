import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.next());
		long[] x= new long[q];
		long[] d= new long[q];
		long[] n= new long[q];
		for(i=0; i<q; i++) {
			x[i] = Integer.parseInt(sc.next());
			d[i] = Integer.parseInt(sc.next());
			n[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		long s;
		long di;
		for(i=0; i<q; i++) {
			s = x[i];
			di = 0;
			for(j=1; j<n[i]; j++) {
				di += d[i];
//				System.out.println(s);
				s*= (di+x[i]);
//				System.out.println("x"+(x[i]+di));
				if(s>=1000003) s = s % 1000003;
			}
			System.out.println(s%1000003);
		}
	}
}