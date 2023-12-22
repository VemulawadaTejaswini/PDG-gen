import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] t = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];
		for(int i = 0; i < N; i++) {
			t[i] = Integer.parseInt(sc.next());
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		boolean flag = true;
		int dt = 0;
		int dx = 0;
		int dy = 0;
		for(int i = 0; i < N; i++) {
			int d = Math.abs(x[i]-dx)+Math.abs(y[i]-dy);
			if(t[i]-dt < d) {
				flag = false;
				break;
			}else if(t[i]-dt == d) {
				dt = t[i];
				dx = x[i];
				dy = y[i];
			}else {
				int h = t[i]-dt-d;
				if(h % 2 == 0) {
					dt = t[i];
					dx = x[i];
					dy = y[i];
				}else {
					flag = false;
					break;
				}
			}
		}

		if(flag) System.out.println("Yes");
		if(!flag) System.out.println("No");
	}

}
