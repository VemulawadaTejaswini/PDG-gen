import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String op = sc.next();
		int x = sc.nextInt(), y = sc.nextInt();
		List<Integer> d[] = new ArrayList[2];
		d[0] = new ArrayList<>();
		d[1] = new ArrayList<>();
		
		int sum[] = new int[2];
		int cnt = 0;
		int dir = 0;
		for(int i=0;i<op.length();i++){
			if(op.charAt(i) == 'T'){
				if(cnt != 0){
					d[dir].add(cnt);
					sum[dir] += cnt;
					cnt=0;
				}
				dir = 1-dir;
			}
			else{
				cnt++;
			}
		}
		if(cnt!=0){
			d[dir].add(cnt);
			sum[dir] += cnt;
		}
		
		if(op.charAt(0)=='F'){
			int f = d[0].remove(0);
			sum[0] -= f;
			x-=f;
		}
		
		int dpx[] = new int[8001];
		int dpy[] = new int[8001];
		dpx[0] = 1;
		dpy[0] = 1;
		
		for(int i=0;i<d[0].size();i++){
			int val = d[0].get(i);
			for(int j=8000;j>=val;j--){
				if(dpx[j-val]==1){
					dpx[j] = 1;
				}
			}
		}
		for(int i=0;i<d[1].size();i++){
			int val = d[1].get(i);
			for(int j=8000;j>=val;j--){
				if(dpy[j-val]==1){
					dpy[j] = 1;
				}
			}
		}
		
		if(check(dpx, dpy, x, y, sum)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	static boolean check(int dpx[], int dpy[], int x, int y, int sum[]){
		x = Math.abs(x);
		y = Math.abs(y);
		
		if(sum[0]<x || sum[1]<y)
			return false;
		
		boolean ok1 = false;
		for(int i=0;i<=sum[0];i++){
			if(dpx[i]==1 && Math.abs(sum[0]-i-i) == x){
				ok1 = true;
			}
		}
		boolean ok2 = false;
		for(int i=0;i<=sum[1];i++){
			if(dpy[i]==1 && Math.abs(sum[1]-i-i) == y){
				ok2 = true;
			}
		}
		
		return ok1 && ok2;
	}
}
