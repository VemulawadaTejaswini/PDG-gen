import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();

		ArrayList<ArrayList<Integer>> x = new ArrayList<>();
		for(int i=0; i<n; i++) {
			ArrayList<Integer> t = new ArrayList<>();
			for(int j=0; j<d; j++) {
				t.add(sc.nextInt());
			}
			x.add(t);
		}

		int ans = 0;
		for(int i=1; i<n; i++) {

			for(int j=0; j<i; j++) {
				long s = 0;
				for(int k=0; k<d; k++) {
					int y=x.get(i).get(k);
					int z=x.get(j).get(k);
					s += Math.abs(y-z)*Math.abs(y-z);
				}
				double sq = Math.sqrt(s);
				int sd = (int)sq;
				if(sq-sd==0.0) {
					ans++;
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
