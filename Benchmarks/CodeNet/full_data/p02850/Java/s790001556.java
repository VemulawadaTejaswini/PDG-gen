import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] cnum = new int[N+1];
		for(int i = 0; i < N-1; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			cnum[a[i]]++;
			cnum[b[i]]++;
		}
		int color = 0;
		for(int i = 1; i <= N; i++)
			color = Math.max(color, cnum[i]);
		Map<Integer, TreeSet<Integer>> m = new HashMap<>();
		for(int i = 1; i <= N; i++) {
			m.put(i, new TreeSet<>());
			m.get(i).add(0);
		}
		System.out.println(color);
		for(int i = 0; i < N-1; i++) {
			int amax = m.get(a[i]).last();
			int bmax = m.get(b[i]).last();
			int num = Math.max(amax, bmax)+1;
			int amin = 0, bmin = 0;
			if(m.get(a[i]).size()>1)
				amin = m.get(a[i]).higher(0);
			if(m.get(b[i]).size()>1)
				bmin = m.get(b[i]).higher(0);
			if(amin > 1 || bmin > 1) {
				num = Math.max(amin-1, bmin-1);
				if(amin > bmin) {
					while(true) {
						if(!m.get(b[i]).contains(num))
							break;
						num--;
					}
				}
				if(bmin > amin) {
					while(true) {
						if(!m.get(a[i]).contains(num))
							break;
						num--;
					}
				}
			}
			m.get(a[i]).add(num);
			m.get(b[i]).add(num);
			System.out.println(num);
		}

	}

}