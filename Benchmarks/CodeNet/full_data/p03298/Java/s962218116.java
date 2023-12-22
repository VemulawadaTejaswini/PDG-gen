import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		char[] l = new char[n];
		char[] r = new char[n];
		boolean same = true;
		for(int i=0;i<n;i++) {
			l[i] = s.charAt(i);
			r[i] = s.charAt(2*n-1-i);
			if(same && l[i]!=r[i]) same = false;
		}
		if(same) {
			System.out.println(conbination(2*n, n));
			return;
		}
		char[][] buf = new char[2][n];
		long count = 0;
		for(int i=0;i<(1<<(n-1));i++) {
			int[] p = new int[2];
			for(int j=0;j<n;j++) {
				int k = (i>>(n-1-j))&1;
				buf[k][p[k]++] = s.charAt(j);
			}
			long res = calc(buf,r,p);
			count += res*2;
		}
		System.out.println(count);
	}
	
	public static long calc(char[][] buf,char[] r,int[] p) {
		int ptr0 = 0;
		int ptr1 = 0;
		int[][] stack = new int[2][20];
		int stackPtr = 0;
		long count = 0;
		while(true) {
			int ptr = ptr0 + ptr1;
			boolean p0 = ptr0<p[0];
			boolean b0 = false;
			if(p0) b0 = buf[0][ptr0]==r[ptr];
			boolean p1 = ptr1<p[1];
			boolean b1 = false;
			if(p1) b1 = buf[1][ptr1]==r[ptr];
			if(b0 && b1 && p0 && p1) {
				stack[0][stackPtr] = ptr0;
				stack[1][stackPtr] = ptr1+1;
				ptr0++;
				stackPtr++;
				continue;
			}
			if(b0 && p0) {
				ptr0++;
				continue;
			}
			if(b1 && p1) {
				ptr1++;
				continue;
			}
			if(!p0 && !p1) {
				count++;
			}
			if(stackPtr>0) {
				stackPtr--;
				ptr0 = stack[0][stackPtr];
				ptr1 = stack[1][stackPtr];
				continue;
			}
			break;
		}
		return count;
	}
	
	public static long conbination(int n,int r) {
		long res = 1;
		for(int i=1;i<=r;i++) {
			res = res * (n-i+1) / i;
		}
		return res;
	}

}