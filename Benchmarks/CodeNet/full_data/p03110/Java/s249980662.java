import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double x[] = new double[N];
		String u[] = new String[N];
		double ans = 0;
		for(int i = 0; i < N; i++) {
			x[i] = Double.parseDouble(sc.next());
			u[i] = sc.next();
			if(u[i].equals("JPY")) {
				ans += x[i];
			} else {
				ans = ans + (x[i] * 380000);
			}
		}
		
		System.out.println(ans);
	}
}
