
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        int sum = 0;
        int del[] = new int[d];
        //int count = 0;
        int[][] point = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                point[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    sum += (point[i][k] -point[j][k])*(point[i][k] -point[j][k]);
                }
                double k = sqrt(sum);
                if ( k== (int) k) {
                    count++;
                }
                sum = 0;
            }
        }
        System.out.print(count);
    }

}
