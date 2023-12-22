
import java.util.Scanner;

public class c_vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] map = new long[N][3];
        for(int i = 0 ; i < N ; i++)
        {
            for(int j = 0 ; j < 3; j++)
                map[i][j] = sc.nextInt();
            if(i>0)
            {
                for(int j = 0 ; j < 3 ; j++)
                {
                    map[i][j] = Math.max(map[i-1][(j+1) % 3] + map[i][j], map[i-1][(j+2 )% 3]+map[i][j]);
                }
            }
        }
        System.out.println(Math.max(Math.max(map[N-1][0],map[N-1][1]),map[N-1][2]));

    }
}
