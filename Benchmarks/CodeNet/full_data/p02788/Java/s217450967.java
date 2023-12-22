import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		
		Monster[] m = new Monster[n];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			int t = (int)Math.ceil((double)h/a);
			m[i] = new Monster(x, t);
		}
		
		Arrays.sort(m, new Comparator<Monster>() {

			@Override
			public int compare(Monster o1, Monster o2) {
				if(o1.x>o2.x)
					return 1;
				else if(o1.x==o2.x)
					return 0;
				else
					return -1;
			}
			
		});
		
		int[] attack = new int[n];
		int l = 0, r = 1;
		while(l<n && r<n) {
			if(m[r].x-m[l].x<=2*d) {
				r++;
			}
			else {
				attack[l] = r-1;
				l++;
			}
		}
		for(int i=l;i<n;i++) {
			attack[i] = r-1;
		}
		
		
		int[] reduce = new int[n+1];
		int sum = 0;
		long time = 0;
		for(int i=0;i<n;i++) {
			sum+=reduce[i];
			int t = m[i].t+sum;
			if(t>0) {
				time+=t;
				sum-=t;
				reduce[attack[i]+1] = t;
			}
		}
		
		System.out.println(time);
	}
}
class Monster{
	int x, t;
	Monster(int x, int t){
		this.x = x;
		this.t = t;
	}
}