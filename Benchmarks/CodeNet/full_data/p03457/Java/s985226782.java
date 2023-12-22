import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] ti = new int[N+1];
		int[] xi = new int[N+1];
		int[] yi = new int[N+1];
		ti[0] = xi[0] = yi[0] = 0;
		for (int i=1; i<N+1; i++) {
			ti[i] = sc.nextInt();
			xi[i] = sc.nextInt();
			yi[i] = sc.nextInt();
		}

		String can = "Yes";
		for (int i=0; i<N; i++) {
			int dt = ti[i+1] - ti[i];
			int dist = Math.abs(xi[i+1] - xi[i]) + Math.abs(yi[i+1] - yi[i]);
			//System.out.println("debug dt=" + dt + ", dist=" + dist);
			if (dt < dist) {
				can = "No";
				break;
			}
			if ((dt % 2) != (dist % 2)) {
				can = "No";
				break;
			}
		}
		System.out.println(can);

	}

}
