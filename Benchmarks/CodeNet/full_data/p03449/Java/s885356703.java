import java.util.*;

public class Main {
    public static int maxCandies(int a[][], int i, int j, int sum) {
        if(i >= 2 || j >= a[0].length) {
            return 0;
        }
        if(i == 1 && j == a[0].length - 1)
            return a[i][j];
        sum += Math.max(a[i][j] + maxCandies(a, i+1, j, sum), a[i][j] + maxCandies(a, i, j+1, sum));
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[2][n];
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        }
        System.out.println(maxCandies(a, 0, 0, 0));
        in.close();
    }

}