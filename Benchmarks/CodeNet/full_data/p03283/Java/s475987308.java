

import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int [][] train = new int [m][2];

        for (int i = 0; i < m; ++i) {
            train[i][0] = sc.nextInt();
            train[i][1] = sc.nextInt();
        }
        for (int i = 0; i < q; ++i) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = 0;
            for (int j = 0; j < m; ++j) {
                if (train[j][0] >= start && train[j][1] <= end) {
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
