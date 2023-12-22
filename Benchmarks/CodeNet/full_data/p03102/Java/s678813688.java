import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = scan.nextInt();

        int[] list = new int[m];
        int[][] map = new int[n][m];

        for(int i = 0; i < m; i++) {
        	list[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		map[i][j] = scan.nextInt();
        	}
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
        	int sum = 0;
        	for(int j = 0; j < m; j++) {
        		sum += map[i][j] * list[j];
        	}
        	if(sum + c > 0)
        		ans++;
        }
        System.out.println(ans);
    }
}