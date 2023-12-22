import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        double sum = 0;
        for (int i = 0; i < n-1; i++) {
            if(i == 0) {
                sum += (v[i] + v[i+1]) / 2;
            } else {
                sum = (sum + v[i+1]) / 2;
            }
        }

        System.out.println(sum);

    }

}
