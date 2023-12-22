import java.util.*;

public class Main {

    private static int ans = 0;
    private static int[][] targetMap;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        targetMap = new int[4][N+2];

        String[] line = sc.nextLine().split(" ");

        for(int i = 0; i < N;i++){
            targetMap[1][i+1] = Integer.parseInt(line[i]);
        }

        line = sc.nextLine().split(" ");

        for(int i = 0; i < N;i++){
            targetMap[2][i+1] = Integer.parseInt(line[i]);
        }

        rec(1,1,N);

        System.out.println(max);
    }

    public static void rec(int y, int x, int N) {

        ans += targetMap[y][x];
        //System.out.println(y + ":" + x + ":ans:" + ans);


        if(y == 2 && x == N){
            if(max < ans){
                max = ans;
            }
            return;
        }

        if (x < N){
            rec(y,x+1,N);
            ans -= targetMap[y][x+1];
        }

        if (y < 2){
            rec(y + 1,x,N);
            ans -= targetMap[y+1][x];
        }

        if (x < N){
            rec(y,x+1,N);
            ans -= targetMap[y][x+1];
        }
    }
}
