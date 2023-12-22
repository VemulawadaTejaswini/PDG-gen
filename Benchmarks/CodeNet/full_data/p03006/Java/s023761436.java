import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		for(i=0;i<n;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int dx,dy;
		int max = 1;
		HashMap<Long, Integer> dxdyMap = new HashMap<>(); 
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)continue;
				dx = x[i]-x[j];
				dy = y[i]-y[j];
				long dxdy = (((long)dx) << 32) + dy;
				Integer cnt = dxdyMap.get(dxdy);
				if(cnt == null) {
					cnt = 1;
				} else {
					cnt++;
				}
				dxdyMap.put(dxdy, cnt);
			}
		}
		if(!dxdyMap.isEmpty()) {
			ArrayList<Integer> dxdyList = new ArrayList<>(dxdyMap.values());
			max = Collections.max(dxdyList);
		} else {
			max = 1;
		}
		if(max==n)max--;
		System.out.println(n-max);
	}
}
