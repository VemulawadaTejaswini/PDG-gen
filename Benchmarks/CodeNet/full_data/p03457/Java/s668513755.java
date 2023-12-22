import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt()+1;
		int[] t = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];
		t[0] = x[0] = y[0] = 0;
		for(int i = 1;i < N;i++){
			t[i] = s.nextInt();
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}

		boolean d = true;
		for(int i = 0;i < N-1;i++){
			int xm = Math.abs(x[i+1] - x[i]);
			int ym = Math.abs(y[i+1] - y[i]);
			int tm = t[i+1] - t[i];
			d = (tm - (ym + xm)) > 0 && (tm - (ym + xm)) % 2 == 0;
		}

		System.out.println(d ? "Yes":"No");


	}

}