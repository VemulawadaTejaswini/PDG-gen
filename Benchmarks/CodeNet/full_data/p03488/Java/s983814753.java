
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class R{
		int x;
		int y;
		int d;
		int n;
		R(int x, int y, int d, int n){
			this.x=x;
			this.y=y;
			this.d=d;
			this.n=n;
		}
	}
	String s;
	int len;
	public void run() {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		len=s.length();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean ans = calc(x,y);
		if(ans)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}

	public boolean calc(int gx, int gy) {
		ArrayDeque<R> q = new ArrayDeque<>();
		q.add(new R(0,0,0,0));
		while(!q.isEmpty()) {
			R r = q.poll();
			while(r.n<len && s.charAt(r.n)=='F') {
				if(r.d==0) {
					r.x++;
				}
				if(r.d==1) {
					r.y++;
				}
				if(r.d==2) {
					r.x--;
				}
				if(r.d==3) {
					r.y--;
				}
				r.n++;
			}
			if(r.n==len) {
				if(r.x==gx && r.y==gy) {
					return true;
				}
			}else {

				q.add(new R(r.x, r.y, (r.d+1)%4, r.n+1));
				q.add(new R(r.x, r.y, (r.d-1+4)%4, r.n+1));
			}
		}
		return false;
	}
}
