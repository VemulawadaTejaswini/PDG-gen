import java.util.*;
class Main {
    static int[][] cp;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = Integer.parseInt(sc.next());
	int W = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());

	int[][] a = new int[H+1][W+2];
	cp = new int[W+1][W+1];
	a[0][1] = 1;
	for(int i = 1; i<=H; i++) {
	    for(int j = 1; j<=W; j++) {
		a[i][j] = a[i-1][j-1]*countP(j-3, W-(j+1)) + a[i-1][j]*countP(j-2, W-(j+1)) + a[i-1][j+1]*countP(j-2, W-(j+2));
		//		System.out.println(i+ " "+ j + " " + countP(j-3, W-(j+1)) + " " + countP(j-2, W-(j+1)) + " " + countP(j-2, W-(j+2)) + " " + a[i][j]);
	    }
	}
	System.out.println(a[H][K]);
    }
    public static int countP(int l, int r) {
	if(l<0)  l = 0;
	if(r<0)  r = 0;

	if(cp[l][r] != 0) return cp[l][r];
	int cnt=0;
	for(int i = 0; i<=Math.pow(2,l) && l>0; i++) {
	    int ci = i;
	    boolean f = false;
	    while(ci>0) {
		if (ci%2 == 1 && f== false) f = true;
		else if(ci%2==1) break;
		else f = false;
		ci/=2;
		if(ci==0) cnt++;
	    }
	}

	if(cnt==0) cnt++;
	int cnt2 = 0;
	for(int i = 0; i<=Math.pow(2,r) && r>0; i++) {
            int ci = i;
            boolean f =false;
	    while(ci>0) {
                if (ci%2 == 1 && f== false) f = true;
                else if(ci%2==1) break;
		else f = false;
                ci/=2;
		if(ci==0) cnt2++;
            }
        }
	if(cnt2==0) cnt2++;
	cp[l][r] = cnt*cnt2;
	return cp[l][r];

    }
}