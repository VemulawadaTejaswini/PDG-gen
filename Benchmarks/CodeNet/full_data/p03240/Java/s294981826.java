import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int H;
		int u=0;
		int[]x = new int [n];
		int[]y = new int [n];
		int[]h = new int [n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			h[i]=sc.nextInt();
			if(h[i]>0)u=i;
			
		}
		int t;
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				H=h[u]+Math.abs(i-x[u])+Math.abs(j-y[u]);
				t=0;
				for(int k=0;k<n;k++) {
					int Hh=Math.max(H-Math.abs(i-x[k])-Math.abs(j-y[k]),0);
					if(Hh!=h[k]) {
						t=1;
						break;
					}
				}
				if(t==0)
					System.out.println(i+" "+j+" "+H);
			}
		}
	}

}
