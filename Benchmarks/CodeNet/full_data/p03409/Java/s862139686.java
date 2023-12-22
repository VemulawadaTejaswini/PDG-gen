import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] g = new int[N*2][N*2]; // 1:red. 2:blue.
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = 1;
        }
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = 2;
        }
        int[][] rest = new int[N*2][N*2];
        int ans = 0;
        for(int x = 0; x < N*2; x++){
            for(int y = 0; y < N*2; y++){
                if(x > 0 && y > 0) rest[x][y] = rest[x-1][y] + rest[x][y-1] - rest[x-1][y-1];
                else if(x == 0 && y > 0) rest[x][y] = rest[x][y-1];
                else if(x > 0 && y == 0) rest[x][y] = rest[x-1][y];

                if(g[x][y] == 1){
                    rest[x][y]++;
                }else if(g[x][y] == 2 && rest[x][y] > 0){
                    ans++;
                    rest[x][y]--;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
