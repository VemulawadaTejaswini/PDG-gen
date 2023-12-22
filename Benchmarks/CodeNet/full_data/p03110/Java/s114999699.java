import java.util.Scanner;

class Problem {
    private int N;
    private double sum;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        sum = 0.0;
        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            String u = sc.next();
            if (u.equals("JPY")) {
                sum += x;
            } else {
                sum += 380000.0 * x;
            }
        }
    }

    double solve() {
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
