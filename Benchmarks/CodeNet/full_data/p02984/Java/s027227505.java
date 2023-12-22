import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		int sum = 0;
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			a.add(v);
			sum += v;
		}

		ArrayList<Integer> ans = new ArrayList<>();
		int x1 = sum;
		for(int i=1; i<n-1; i+=2) {
			x1 -= 2*a.get(i);
		}
		ans.add(x1);
		for(int i=1; i<n; i++) {
			int nx = 2*a.get(i-1)-ans.get(i-1);
			ans.add(nx);
		}
		for(int i=0; i<ans.size(); i++) {
			System.out.print((i>0 ? " " : "") + ans.get(i));
		}
		System.out.println();
		sc.close();
	}
}
