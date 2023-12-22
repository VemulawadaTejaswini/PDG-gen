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
		for(int i=0;i<str.length();i++) {
			kids[calcPos(i,1000)]++;
		}

		for(int i=0;i<kids.length-1;i++) {
			System.out.print(kids[i]+" ");
		}
		System.out.println(kids[kids.length-1]);
	}

	public static int calcPos(int pos, int times) {
		int next = pos+move(mv[pos]);
		if(times == 1) {
			return next;
		}else {
			if(mv[pos]==mv[next]) {
				return calcPos(next,times-1);
			}else {
				if(times%2==0) {
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