import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = 1 / scan.nextDouble();
            sum += a[i];
        }
        System.out.println(1 / sum);
    }
}