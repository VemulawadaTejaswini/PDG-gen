import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        double r = 0;
        double log2 = Math.log(2);
        double perDice = 1.0d/n;
        for(int i=1; i<=n; i++) {
            double score = (double)i;
            double req = Math.ceil(Math.log(k/score)/log2);
            double possibility = Math.min(1.0, Math.pow(0.5, req));
            r += perDice * possibility;
        }
        System.out.println(r);
    }
}
