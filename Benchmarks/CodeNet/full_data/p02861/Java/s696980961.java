import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	double x[];
	double y[];
	boolean used[];
	ArrayList<Double> ans = new ArrayList<Double>();

	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		x = new double[N];
		y = new double[N];
		for(int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		used = new boolean[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				used[j]=false;
			}
			used[i]=true;
			dfs(i, 0, 0.0);
			used[i]=false;
		}
		double sum = 0.0;
		for(int i=0; i<ans.size(); i++) {
			sum += ans.get(i);
		}
		System.out.println(sum/ans.size());
		sc.close();
	}

	public void dfs(int i, int c, double sum) {

		if(c >= N-1) {
			ans.add(sum);
			return;
		}

		for(int j=0; j<N; j++) {
			if(!used[j]) {
				used[j] = true;
				dfs(j, c+1, sum+dist(i, j));
				used[j] = false;
			}
		}
	}

	public double dist(int i, int j) {
		return Math.sqrt(Math.pow(x[i]-x[j], 2)+Math.pow(y[i]-y[j], 2));
	}
}
