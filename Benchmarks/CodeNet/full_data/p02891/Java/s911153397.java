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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long T = sc.nextLong();
		// issix issii
		boolean changeFirstOrLast = false;
		long ret = 0;
		if(S.charAt(S.length() - 1) == S.charAt(0)){
			if(S.length() == 1){
				ret += T - 1;
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
		System.out.println(ret);
	}
}
