
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        double aveArr[] = new double[n+(k-1)];

        for (int i = 0; i < (n+(k-1)); i++) {
            aveArr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            double ki = (p+1.0)/2.0;
            for (int j = 0; i+j < n+(k-1) && j < k; j++) {
                aveArr[i + j] += ki;
            }
        }

        double max = 0.0;
        for (int i = 0; i < (n+(k-1)); i++) {
            if (aveArr[i] > max) max = aveArr[i];
        }
        System.out.println(max);
    }
}