import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int ret = ((int)(t+0.5)/a)*b;
		out.println(ret);
	}
	
	public static void B(Scanner sc) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int N = sc.nextInt();
		int[] subs = new int[N];
		for(int i=0;i<N;i++) {
			subs[i] = sc.nextInt();
 		}
		for(int i=0;i<N;i++) {
			subs[i] -= sc.nextInt();
			if(subs[i]>0) sum+=subs[i];
		}
		out.println(sum);
		
	}
	
	public static void D(Scanner sc) {
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int count=0;
		long sum = 0;
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			if(n<0) count++;
			if(Math.abs(n)<min) min = Math.abs(n);
			sum += Math.abs(n);
		}
		if(count%2==1) sum-=min*2;
		out.println(sum);
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
		boolean alec = false;
		boolean alec2 = false;
		int ngd1 = A[0]/gd;
		int ngd2 = A[1]/gd; //0 except
		int ngd3 = A[N-1]/gd;
		for(int i=1;i<N;i++) {
			A[i] /= gd;
			ngd2 = gcd(ngd2,A[i]);
			if(alec==false && gcd(ngd1,A[i])==1) {
				alec = true;
			}
			else ngd1 = gcd(ngd1,A[i]);
			if(alec2==false && gcd(ngd3,A[N-1-i])==1) {
				alec2 = true;
			}
			else ngd3 = gcd(ngd3,A[N-1-i]);
		}
		out.println(gd*Math.max(Math.max(ngd1, ngd3), ngd2));
	}
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

}
