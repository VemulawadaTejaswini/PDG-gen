import java.util.Random;
import java.util.Scanner;

public class Main {
	static long minChange(String S){
		long c = 0;
		for(int i = S.length() - 1 ; i > 0 ; --i){
			if(S.charAt(i) == S.charAt(i - 1)){
				++c;
				--i;
			}
		}
		return c;
	}
	// a a a a a 
	// a x a x a
	static long solve(String S , long T){
		long ret = 0;
		if(S.charAt(S.length() - 1) == S.charAt(0)){
			char c = S.charAt(0);			
			boolean oneChar = true;
			for(int i = 1 ; i < S.length() ; ++i){
				if(S.charAt(i) != c){
					oneChar = false;
				}
			}
			if(oneChar){
				T = T * S.length();
				ret = T / 2;
			}else{
				String S_n = '_' + S.substring(1);
				long l1 = minChange(S) + minChange(S_n) * (T - 1) + T -1;
				String S_n2 = S.substring(0, S.length() - 1) + '_';
				long l2 = minChange(S) + minChange(S_n2) * (T - 1) + T - 1;
				ret = Math.min(l1, l2);
			}
		}else{
			ret = minChange(S) * T;
		}
		return ret;
	}
	static long solveSmall(String S, long T){
		String r = "";
		for(int t = 0 ; t < T ; ++t){
			r = r + S;
		}
		return minChange(r);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long T = sc.nextLong();
		long ret = solve(S , T);
		/*
		long ret2 = solveSmall(S, T);
		Random r = new Random();
		for(int i = 0 ; i < 1000 ; ++i){
			int l = r.nextInt(10) + 1;
			String s = "";
			for(int j = 0 ; j < l ; ++j){
				int rr = r.nextInt(3);
				s += (char)(rr + 'a');
			}
			int t = r.nextInt(5) + 1;
			long r1 = solve(s, t);			 
			long r2 = solveSmall(s, t);			 
			if(r1 != r2){
				System.out.println(s+" "+t);
			}
		}
		System.out.println(ret + " " + ret2);
		*/
		System.out.println(ret);
	}
}
