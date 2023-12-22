import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}
	
	public static void A(Scanner sc) {
		int m = sc.nextInt();
		out.println(24-m+24);
	}
	
	public static void B(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		Pattern p = Pattern.compile("[0-9]{"+ a + "}-[0-9]{" + b + "}");
		Matcher m = p.matcher(s);
		if(m.find()) out.println("Yes");
		else out.println("No");
	}
	
	// t+e%f == 0 満たす最初のe>0を求め、eを返す
	public static int rete(int t, int f) {
		return (int)Math.ceil(t/(double)f)*f - t;
	}
	
	//受け取ったi -> Nの所要時間を返す
	public static int calctime(int i, int[] S, int[] F, int[] C) {
		if(i==S.length) return 0;
		int t = S[i]+C[i];
		for(int j=i+1;j<S.length;j++) {
			if(t<=S[j]) t+=(S[j]-t)+C[j];
			else t+=rete(t,F[j])+C[j];
		}
		return t;
	}
	
	public static void C(Scanner sc) {
		int N = sc.nextInt();
		int[] C = new int[N-1];
		int[] S = new int[N-1];
		int[] F = new int[N-1];
		for(int i=0;i<N-1;i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			out.println(calctime(i,S,F,C));
		}
	}
	
	// b[i]==1 -> 素数なbを返す
	public static boolean[] eratos(int n) {
		boolean[] ret = new boolean[n+1];
		if(n<2) return ret;
		for(int i=2;i<n+1;i++) ret[i] = true;
		for(int i=2;i<n;i++) {
			if(ret[i]) {
				for(int k=2;i*k<n+1;k++) ret[i*k]=false;
			}
		}
		return ret;
	}
	
	//make 2017 ただし、min~max
	public static HashSet<Integer> get2017(boolean[] b, int min, int max){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=(min+1)/2;2*i-1<max+1;i++) {
			if(b[i] && 2*i-1<b.length &&  b[2*i-1]) set.add(2*i-1);
		}
		return set;
	}
	
	public static void D(Scanner sc) {
		int Q = sc.nextInt();
		int[] l = new int[Q];
		int[] r = new int[Q];
		int[] res = new int[Q];
		int minl = Integer.MAX_VALUE;
		int maxr = 0;
		for(int i=0;i<Q;i++) {
			l[i] = sc.nextInt();
			if(l[i]<minl) minl=l[i];
			r[i] = sc.nextInt();
			if(r[i]>maxr) maxr=r[i];
		}
		boolean[] primelist = eratos(maxr);
		HashSet<Integer> set2017 = get2017(primelist,minl,maxr);
		for(int cand : set2017) {
			//out.println(cand);
			for(int i=0;i<Q;i++) {
				if(cand>=l[i] && cand<=r[i]) res[i]++;
			}
		}
		for(int i=0;i<Q;i++) {
			out.println(res[i]);
		}
	}
}
