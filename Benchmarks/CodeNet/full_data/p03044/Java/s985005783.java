import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[][] = new int[N-1][3];
		for(int i=0;i<N-1;i++) {
			a[i][0]=sc.nextInt(); //from
			a[i][1]=sc.nextInt(); //to
			a[i][2]=sc.nextInt(); //dist
		}
		sc.close();
		
		//sort by from
		Arrays.sort(a,(t1,t2)->t1[0]-t2[0]);
		
		int v[] = new int[N];// white -1, black 1
		v[0]=-1;
		for(int i=0;i<N-1;i++) {
			int from = a[i][0];
			int to = a[i][1];
			int dist = a[i][2];
			
			if(v[from - 1]!=0) {
				if(dist%2==1) {
					v[to - 1]=(-1)*v[from - 1];
				}
			}else if(v[to - 1]!=0) {
				if(dist%2==1) {
					v[from - 1]=(-1)*v[to - 1];
				}
			}else {
				v[from - 1]=-1;
				if(dist%2==1) {
					v[to - 1]=(-1)*v[from - 1];
				}else {
					v[to - 1]=v[from - 1];
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			v[i]=Math.max(v[i],0);
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int tmp:v) {
			sb.append(tmp);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}