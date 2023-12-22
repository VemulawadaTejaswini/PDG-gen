import java.util.Scanner;
 
class Main {
	int w;
	int h;
	int n;
	int[] x;
	int[] y;
	int[] a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		w = sc.nextInt();
		h = sc.nextInt();
		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		a = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
	}
	void solve(){
		int sx = 0,sy = 0;
		int gx = w,gy = h;
		for(int i=0;i<n;i++){
			switch(a[i]){
			case 1:
				sx = Math.max(sx, x[i]);
				break;
			case 2:
				gx = Math.min(gx, x[i]);
				break;
			case 3:
				sy = Math.max(sy, y[i]);
				break;
			case 4:
				gy = Math.min(gy, y[i]);
				break;
			}
		}
		System.out.println((gx-sx)>0&&(gy-sy)>0?(gx-sx)*(gy-sy):0);
	}
}
