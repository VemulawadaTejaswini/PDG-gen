import java.util.*;
class Main{
    static int n;
    static int x;
    static int y;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        int[][] dis = new int[n][n];
        int[] ans = new int[n];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                dis[i-1][j-1] = Math.min(Math.abs(i-j), Math.min(Math.abs(i-x)+1+Math.abs(j-y), Math.abs(i-y)+1+Math.abs(j-x)));
                if(dis[i-1][j-1] < n-1){ans[dis[i-1][j-1]]++;}
                
            }
        }
        for(int i = 1; i < n; i++){
            System.out.println(ans[i]/2);
        }
    }
}

