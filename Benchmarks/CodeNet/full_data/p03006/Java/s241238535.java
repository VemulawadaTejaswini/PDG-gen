import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j, k;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		for(i=0;i<n;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int dx,dy, dx1, dy1;
		int max = 1;
		ArrayList<Integer> list; 
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j)continue;
				dx = x[i]-x[j];
				dy = y[i]-y[j];
				int cnt = 2;
				list = new ArrayList<>();
				for(k=0;k<n;k++) {
					if(i==k || j == k)continue;
//					System.out.println(""+x[i]+","+y[i]+":"+x[k]+","+y[k]);
					dx1 = x[i]-x[k];
					dy1 = y[i]-y[k];
					if(dx1 == 0 || dx==0) {
						if(dx==dx1) {
//							cnt++;
							if(dy1 % dy == 0) {
								list.add(dy1 / dy);
							}
//							System.out.println(""+x[k]+",0");
						}
					} else if(dy1 == 0||dy == 0) {
						if(dy == dy1) {
//							cnt++;
							if(dx1 % dx == 0) {
								int dd = dx1 / dx;
								if(dd>0) {
									list.add(dx1 / dx);
								}
							}
//							System.out.println("0,"+y[k]);
						}
					} else if(dx1 % dx ==0
							&& dy1 % dy==0) {
						int xx = dx1 / dx; 
						int yy = dy1 / dy; 
						if(xx == yy && xx > 0) {
							list.add(xx);
						}
//						cnt++;
						
//						System.out.println(""+x[k]+","+y[k]);
					}
					Collections.sort(list);
					int m;
					for(m = 0; m < list.size(); m++) {
						if(m != list.get(m)-2) {
							break;
						}
					}
					if(m == list.size()) {
						cnt += list.size();
					} else {
						cnt += m;
					}
				}
				if(cnt > max)max=cnt;
			}
		}
		if(max==n)max--;
//		System.out.println(max);
		System.out.println(n-max);
	}
}
