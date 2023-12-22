
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void testRun() {
		int h = 2*100000;
		int w = 2*100000;
		int n = 2*100000;
		int y = 100000;
		int x = 100000;
		
		char s[] = new char[n];
		char t[] = new char[n];
		for(int i =0;i < n ;i++) {
			s[i] = (new char[]{'R','L'})[i%2];
			t[i] = (new char[]{'R','L'})[i%2];
		}
		
		if(ud(h,w,n,x,y,s,t)) {
			System.out.println("NO");
		}else if(rl(h,w,n,x,y,s,t)) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		
	}
	
	void run() {
		
		int h =sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		if(ud(h,w,n,x,y,s,t)) {
			System.out.println("NO");
		}else if(rl(h,w,n,x,y,s,t)) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
	
	boolean ud(int h,int w,int n,int x,int y,char[] s, char[]t) {
		int ss[] = new int[n];
		int tt[] = new int[n];
		for(int i =0 ; i< n ;i++) {
			if(s[i]=='U') {
				ss[i] = -1;
			}
			if(s[i] == 'D') {
				ss[i] = 1;
			}
			if(t[i]=='U') {
				tt[i]=-1;
			}
			if(t[i] == 'D') {
				tt[i] = 1;
			}
		}
		
		return solve(h,y,n,ss,tt);
	}
	boolean rl(int h,int w, int n, int x, int y, char[] s, char[] t) {
		int ss[] = new int[n];
		int tt[] = new int[n];
		for(int i =0 ; i< n ;i++) {
			if(s[i]=='L') {
				ss[i] = -1;
			}
			if(s[i] == 'R') {
				ss[i] = 1;
			}
			if(t[i]=='L') {
				tt[i]=-1;
			}
			if(t[i] == 'R') {
				tt[i] = 1;
			}
		}
		return solve(w,x,n,ss,tt);
	}
		
	boolean solve(int max, int now, int n , int[] ss, int[] tt) {
		int left = 1;
		int right = max;
		
		for(int i = n-1; i >= 0;i--) {
			if(tt[i] == 1) {
				left = Math.max(1, left-1);
			}
			if(tt[i] == -1) {
				right = Math.min(max, right+1);
			}
			if(ss[i] == 1) {
				right = right-1;
			}
			if(ss[i] == -1) {
				left = left+1;
			}
			if(left > right) {
				return true;
			}
		}
		return !(now >= left && now <=right);
		
	}
}
