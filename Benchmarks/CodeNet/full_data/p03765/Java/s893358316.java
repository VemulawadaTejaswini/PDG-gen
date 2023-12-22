import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	void solve() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int q=sc.nextInt();
		int[]a=new int[q];
		int[]b=new int[q];
		int[]c=new int[q];
		int[]d=new int[q];
		for(int i=0;i<q;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			c[i]=sc.nextInt()-1;
			d[i]=sc.nextInt()-1;
		}
		
		for(int i=0;i<q;i++) {
			String si=press(s.substring(a[i],b[i]+1));
			String ti=press(t.substring(c[i],d[i]+1));
			if(si.equals(ti)){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	String press(String s) {
		while(s.length()>1) {
			if(s.length()>2) {
				s=s.replace("AAA", "");
				s=s.replace("BBB", "");
			}
			if(s.length()>1) {
				s=s.replace("AB","");
				s=s.replace("BA","");
				s=s.replace("BB", "A");
				s=s.replace("AA", "B");
			}
		}
		return s;
	}
}