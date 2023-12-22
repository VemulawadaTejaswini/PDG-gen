import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.*;
public class abc125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}

	

	public static void C(Scanner sc) {
		int N = sc.nextInt();
		int gd;
		int[] A = new int[N];
		gd = A[0] = sc.nextInt();
		for(int i=1;i<N;i++) {
			A[i] = sc.nextInt();
			gd = gcd(gd, A[i]);
		}
		int except=0;
		boolean alec = false;
		int ngd1 = A[0]/gd;
		int ngd2 = A[1]/gd; //0 except
		for(int i=1;i<N;i++) {
			A[i] /= gd;
			ngd2 = gcd(ngd2,A[i]);
			if(alec==false && gcd(ngd1,A[i])==1) {
				alec = true;
				except = i;
			}
			else ngd1 = gcd(ngd1,A[i]);
		}
		
		for(int i=1;i<except;i++) {
			int ngd = A[0]/gd;
			for(int j=1;j<N;j++) {
				if(j==i) continue;
				ngd = gcd(ngd,A[j]);
			}
			if(ngd>ngd1) ngd1 = ngd;
		}
		out.println(gd*Math.max(ngd1, ngd2));
	}
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

}