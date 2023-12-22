import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double xs, ys, xt, yt;
	xs = sc.nextDouble();
	ys = sc.nextDouble();
	xt = sc.nextDouble();
	yt = sc.nextDouble();
	int n = sc.nextInt();
	double[] x = new double[n + 2], y = new double[n + 2],
	    r = new double[n + 2];
        for (int i = 0; i < n; ++i) {
	    x[i] = sc.nextDouble();
	    y[i] = sc.nextDouble();
	    r[i] = sc.nextDouble();
	}
	x[n] = xs;
	y[n] = ys;
	r[n] = 0;
	x[n + 1] = xt;
	y[n + 1] = yt;
	r[n + 1] = 0;

	double[][] dist = new double[n + 2][n + 2];
	for (int i = 0; i < n + 2; ++i) {
	    for (int j = 0; j < n + 2; ++j) {
		double sqdist = Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2);
		double rdist = Math.sqrt(sqdist);
		dist[i][j] = Math.max(0.0, rdist - r[i] - r[j]);
	    }
	}
	for (int k = 0; k < n + 2; ++k) {
	    for (int i = 0; i < n + 2; ++i) {
		for (int j = 0; j < n + 2; ++j) {
		    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
		}
	    }
	}
	System.out.println(dist[n][n + 1]);
    }
}
