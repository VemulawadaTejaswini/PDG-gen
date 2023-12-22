
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double r1 = 0;
		double r2 = 0;
		double ans = 0;
		r1=Math.min(Math.abs(w-x)*h, Math.abs(x)*h);
		r2=Math.min(Math.abs(h-y)*w, Math.abs(y)*w);
		ans = Math.max(r1, r2);
		System.out.print(ans+" ");

		int a1 = (int)Math.max(Math.abs(w-x),x);
		int a2 = (int)Math.min(Math.abs(w-x),x);
		int b1 = (int)Math.max(Math.abs(h-y),y);
		int b2 = (int)Math.min(Math.abs(h-y),y);

		if(a1==b1 && a2==b2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}
