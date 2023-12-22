import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = Double.parseDouble(sc.next());

        int[] X = new int[(int)N];

        for (int i = 0 ; i < N; i++) {
            X[i] = sc.nextInt();
        }

        double average = 0;

        for (int i = 0 ; i < N; i++) {
            average += X[i];
        }

        average = average / N;


        int sum = 0;

        for (int i = 0 ; i < N; i++) {
            sum += Math.pow((X[i] - Math.round(average)),2);
        }
        System.out.println(sum);
    }
}
