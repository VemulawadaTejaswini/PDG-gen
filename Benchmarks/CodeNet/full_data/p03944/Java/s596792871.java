import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
      	int h = scn.nextInt();
      	int n = scn.nextInt();
		int[] x = new int[n];
      	int[] y = new int[n];
      	int[] a = new int[n];
		for(int i=0; i<n; i++){
			x[i] = scn.nextInt();
          	y[i] = scn.nextInt();
          	a[i] = scn.nextInt();
		}
      	int x0 = 0;
      	int y0 = 0;
      	int x1 = w;
      	int y1 = h;
      	for(int i=0; i<n; i++){
          if(a[i]==1 && x0 < x[i]) x0 = x[i];
          if(a[i]==2 && x1 > x[i]) x1 = x[i];
          if(a[i]==3 && y0 < y[i]) y0 = y[i];
          if(a[i]==4 && y1 > y[i]) y1 = y[i];
        }
      	int ans = (x1-x0)*(y1-y0);
      	if(x0>=x1 || y0>=y1) ans = 0;
      	System.out.println(ans);
	}
}
