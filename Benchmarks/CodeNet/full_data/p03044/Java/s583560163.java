import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // 配列の宣言
        int[][] dis = new int[n][n];
        int[] color = new int[n]; //0白 1黒
        int a, b;
        // スペース区切りの整数の入力
        for(int i = 0; i < n - 1; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            dis[a-1][b-1] = sc.nextInt();
        }

        color[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(dis[i][j] != 0){
                    if(dis[i][j] % 2 == 0) color[j] = color[i];
                    else if(color[i] == 0) color[j] = 1;
                    else color[j] = 0;
                }
            }
        }

        String answer = "";

        for(int i = 0; i < n; i++){
            answer += color[i] + " ";
        }

        // 出力
        System.out.println(answer);

    }

}