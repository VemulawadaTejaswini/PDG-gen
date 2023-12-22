import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt()-1;
		int B = sc.nextInt()-1;
		int C = sc.nextInt()-1;
		int D = sc.nextInt()-1;
		String S = sc.next();
		if (C<D) {
			if (check(A,B,S) && check(B,D,S)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (check(A,B,S) && check(B,D,S) && check(D,C,S) && canjump(B,D,S)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	public static boolean check(int s, int g,String S) {
		int flag=0;
		for (int i=s+1;i<g;i++) {
			if (S.charAt(i)=='#') {
				if (flag==0) {
					flag=1;
				} else {
					return false;
				}
			} else {
				flag=0;
			}
		}
		return true;
	}

	public static boolean canjump(int s, int g, String S){
		int flag=0;
		for (int i=s+1;i<g;i++) {
			if (S.charAt(i)=='.') {
				if (flag==0) {
					flag=1;
				} else {
					return true;
				}
			} else {
				flag=0;
			}
		}
		if (flag==1 && S.charAt(g+1)=='.') {
			return true;
		}
		return false;
	}
}
