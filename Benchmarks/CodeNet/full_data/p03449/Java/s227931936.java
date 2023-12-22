import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        sc.nextLine();
        int map[][] = new int[2][N];
        int sum[][] = new int[2][N];
        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < N; j++) {
        		
        		map[i][j] = sc.nextInt();
        		
        		if (j == 0) {
        			sum[i][j] = map[i][j];
        		} else {
        			sum[i][j] = sum[i][j - 1] + map[i][j];
        		}
        	}
        	sc.nextLine();
        }
        
        int ans = 0;
        
        for (int start = N; start > 0; start--) {
        	int candies = 0;
        	if (start == 1) {
        		candies = sum[0][start - 1] + (sum[1][N - 1]);
        	} else {
            	candies = sum[0][start - 1] + (sum[1][N - 1] - sum[1][start - 2]);
        	}
        	if (ans < candies) {
        		ans = candies;
        	}
        }
        
        System.out.println(ans);
    }
}
