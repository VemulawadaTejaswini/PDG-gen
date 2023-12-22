import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double[] p = new double[N];
        HashMap<Double, Double> exp = new HashMap<>();
        for (int i = 0; i < N; i++){
            double pp = sc.nextDouble();
            if (exp.containsKey(pp) == false) {
                exp.put(pp, average(pp));
            }
            for (int j = i; j < i + K ;j++) {
                if (j == N) break;
                p[j] = p[j] + exp.get(pp);
            }
        }
        double max = Arrays.stream(p).max().getAsDouble();
        System.out.println(max);

    }
    public static double average(double  a){
        return (1 + a) / 2;
    }
}
