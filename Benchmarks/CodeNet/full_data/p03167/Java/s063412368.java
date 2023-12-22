import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        List<String> list = new ArrayList<>();
        long[][] dp = new long[h][w];
        for(int i = 0; i < h; i++){
            list.add(scanner.next());
        }
        for(int i = 0; i < h; i++){
            if(list.get(i).charAt(0) == '#')
                break;
            dp[i][0] = 1;
        }
        for(int i = 0; i < w; i++){
            if(list.get(0).charAt(i) == '#')
                break;
            dp[0][i] = 1;
        }
        for(int i = 1; i < h; i++){
            for(int j = 1; j < w; j++){
                if(list.get(i).charAt(j) == '#'){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    dp[i][j] %= 1000000007;
                }
            }
        }
        System.out.println(dp[h-1][w-1]);
    }
}
