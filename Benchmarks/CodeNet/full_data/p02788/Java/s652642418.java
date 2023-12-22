import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		
		Dis[] arr = new Dis[n];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			int l = x-d;
			int r = x+d;
			if(l<1)
				l = 1;
			arr[i] = new Dis(l, r, (int)Math.ceil((double)h/a));
		}
		Arrays.sort(arr, new Comparator<Dis>() {

			@Override
			public int compare(Dis o1, Dis o2) {
				if(o1.l>o2.l)
					return 1;
				else if(o1.l==o2.l) {
					if(o1.r>o2.r)
						return 1;
					else if(o1.r==o2.r)
						return 0;
					else
						return -1;
				}
				else
					return -1;
			}
			
		});
		
		long ans = 0;
		int l = arr[0].l, r = arr[0].r, h = arr[0].h;
		for(int i=1;i<n;i++) {
			if(arr[i].l<=r) {
				r = arr[i].r;
				h = Math.max(h, arr[i].h);
			}
			else {
				ans+=h;
				l = arr[i].l;
				r = arr[i].r;
				h = arr[i].h;
			}
		}
		if(h!=0)
			ans+=h;
		
		System.out.println(ans);
	}

}
class Dis{
	int l, r, h;
	Dis(int l, int r, int h){
		this.l = l;
		this.r = r;
		this.h = h;
	}
}