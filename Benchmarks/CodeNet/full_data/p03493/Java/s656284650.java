import java.util.*;
public class Main {
	public static void main(String[] args) {
		A();
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ret  = 0;
		for(int i=0;i<s.length();i++) {
			ret += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(ret);
	}
	
	//0...M   2^M > 最小の要素 の範囲で 2^kで全て割り切れるかで２分探索 O(Nloglogminval)
	// 0...Mまで順に確かめると、O(Nlogminval)
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
  		}
		int maxdo = -1;
		boolean cansep = true;
		while(cansep) {
			maxdo++;
			for(int j=0;j<A.length;j++) {
				int sep = (int) Math.pow(2, maxdo);
				if(A[j]%sep != 0) {
					cansep = false;
					break;  
				}
			}
		}
		System.out.println(maxdo-1);
	}
}