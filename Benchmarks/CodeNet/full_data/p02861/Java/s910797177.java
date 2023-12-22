import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for(int i = 0; i < n; ++i) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(solve(n,points));
    }
    private static double solve(int N, int[][] points) {
        double sum = 0.0;
        for(int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                sum+=dist(i, j, points);
            }
        }
        return 2*sum/(double)N;
    }

    private static double dist(int i, int j, int[][] points) {
        return Math.sqrt(Math.pow(points[i][0]-points[j][0],2)+ Math.pow(points[i][1]-points[j][1],2));
    }
}
