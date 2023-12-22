import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 1;
		for(int i=0;i<N;i++) {
			max *=2;
		}
		max--;
		List<List<People>> list = new ArrayList<List<People>>();
		Main main = new Main ();
		for(int i=0;i<N;i++) {
			int q = sc.nextInt();
			List<People> l = new ArrayList<People>();
			for (int j=0;j<q;j++) {
				People p = main.new People();
				p.p = sc.nextInt();
				p.b = sc.nextInt();
				l.add(p);
			}
			list.add(l);
		}
		int re = 0;
		while (max>0) {
			int a[] = new int[N];
			int i=0;
			int t = max;
			int count =0;
			while (t>0) {
				if (t%2==1) {
					a[i]++;
					count ++;
				}
				t = t/2;
				i++;
			}
			boolean b =true;
			for(int j=0;j<N;j++) {
				if (a[j]==1) {
					List<People> l = list.get(j);
					for (int k =0;k<l.size();k++) {
						if (l.get(k).b!=a[l.get(k).p-1]) {
							b = false;
							break;
						}
					}
					if (b==false) {
						break;
					}
				}
			}
			if (b) {
				if (count>re) {
					re = count;
				}
			}
			max--;
		}
		System.out.println(re);
	}
	public class People {
		int p;
		int b;

	}
}