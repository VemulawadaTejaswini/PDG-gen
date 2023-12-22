import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < d ; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ;j++) {
                int D = 0;
                for (int k = 0 ; k < d ; k++) {
                    D += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                int z = (int) Math.floor(Math.sqrt(D));
                if (z * z == D) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
