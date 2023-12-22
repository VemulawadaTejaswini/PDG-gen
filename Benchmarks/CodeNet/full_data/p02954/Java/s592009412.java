import java.math.BigInteger;

public class Main {
	public static char[] mv;
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		String str = s.next();
		mv = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			mv[i] = str.charAt(i);
		}

		int [] kids;
		kids = new int[str.length()];
		BigInteger big10_100 = BigInteger.TEN.pow(100);
		for(int i=0;i<str.length();i++) {
			kids[calcPos(i,big10_100 )]++;
		}

		for(int i=0;i<kids.length-1;i++) {
			System.out.print(kids[i]+" ");
		}
		System.out.println(kids[kids.length-1]);
	}

	public static int calcPos(int pos, BigInteger times) {
		int next = pos+move(mv[pos]);
		if(times.equals(BigInteger.ONE)) {
			return next;
		}else {
			if(mv[pos]==mv[next]) {
				return calcPos(next,times.subtract(BigInteger.ONE));
			}else {
				if(times.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
					return pos;
				}else {
					return next;
				}
			}

		}
	}
	public static int move(char c) {
		return (c=='R')?1:-1;
	}
}
