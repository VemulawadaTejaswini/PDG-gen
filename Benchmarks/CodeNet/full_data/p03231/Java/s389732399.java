import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String s = in.next();
		String t = in.next();
		int gcd = gcd(n,m);
		int n1 = n/gcd;
		int m1 = m/gcd;
		int nIdx = 0;
		int mIdx = 0;
		boolean flag = true;
		while(nIdx<n) {
			if(s.charAt(nIdx)!=t.charAt(mIdx)) {
				flag = false;
				break;
			}else {
				nIdx += n1;
				mIdx += m1;
			}
		}
		if(flag) {
			System.out.println(n*m/gcd);
		}else {
			System.out.println(-1);
		}
	}
	
	public static int gcd(int a,int b) {
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}

}
