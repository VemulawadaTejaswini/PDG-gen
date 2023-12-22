import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0;  i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += calcDiss(x[i], x[j], y[i], y[j]);
            }
        }

        System.out.println(sum * 2 / n);

    }
    
    static double calcDiss(double x1, double x2, double y1, double y2) {
        double res = 0;
        res += (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        res = Math.sqrt(res);
        return res;
    }
}
