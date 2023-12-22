import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}
	
	public static void A(Scanner sc) {
		String s = sc.next();
		out.println(s.substring(0,3) + 8 + s.substring(4,10));
	}
	
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<N;i++) set.add(sc.nextInt());
		out.println(set.size());
	}
	
	// 4,9の和でtargetを作ることができるか? できるならそれぞれ必要数を返す 無理なら-1,-1
	public static int[] sum49(int target) {
		int n10000 = target/36 * 4;
		int rem = target%36;
		int[] ret = new int[2];
		ret = sum49(rem, ret);
		ret[1] += n10000;
		return ret;
	}
	
	public static int[] sum49(int target, int[] ret) {
		
		if(target==0) return ret;
		if(target<4) {
			int[] c = new int[] {-1,-1};
			return c;
		}
		int[] cand1 = sum49(target-4,ret);
		if(cand1[0]!=-1) {
			cand1[0]++;
			return cand1;
		}
		int[] cand2 = sum49(target-9,ret);
		if(cand2[0]!=-1) {
			cand2[1]++;
			return cand2;
		}
		return cand2;
	}

	public static void C(Scanner sc) {
		int N = sc.nextInt();
		int y = sc.nextInt()/1000;
		int[] ret = sum49(y-N);
		int n1000 = N-ret[0]-ret[1];
		if(ret[0]==-1 || n1000<0) {
			out.println(-1 + " " + -1 + " " + -1);
			return;
		}
		out.println(ret[1] + " " + ret[0] + " " + n1000);
		
	}
	
	public static void D(Scanner sc) {
		int n = sc.nextInt();
		int h = sc.nextInt();
		int maxa = Integer.MIN_VALUE;
		int maxab;
		Integer[] as = new Integer[n];
		Integer[] bs = new Integer[n];
		for(int i=0;i<n;i++) {
			as[i] = sc.nextInt();
			bs[i] = sc.nextInt();
			if(as[i]>maxa) {
				maxa = as[i];
				maxab = bs[i];
			}
		}
		Arrays.sort(as,Collections.reverseOrder());
		Arrays.sort(bs,Collections.reverseOrder());
		int counter = 0;
		for(int i=0;i<bs.length && bs[i]>maxa && h>0;i++) {
			h -= bs[i];
			counter++;
		}
		if(h>0) counter += Math.ceil(h/(double)maxa);
		out.println(counter);
	}
}