import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int m = sc.nextInt();

        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < m; i++) {
        if(table[0][i]>table[1][i])
        	sum+=table[0][i]-table[1][i];
        }
        System.out.println(sum);
		sc.close();
    }
}