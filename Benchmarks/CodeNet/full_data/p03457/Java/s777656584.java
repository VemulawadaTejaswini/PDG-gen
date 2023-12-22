import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int t = 0;
        int x = 0;
        int y = 0;

        for(int i=0; i<N; i++){
            int tmpT = scanner.nextInt();
            int tmpX = scanner.nextInt();
            int tmpY = scanner.nextInt();

            int distance = Math.abs(tmpX - x) + Math.abs(tmpY - y);
            int timeDiff = tmpT - t;

            // 時間
            if(distance <= timeDiff){
                if(distance%2 != timeDiff%2){
                    System.out.println("No");
                    return;
                }
            }else{
                System.out.println("No");
                return;
            }

            // 更新
            t = tmpT;
            x = tmpX;
            y = tmpY;
        }

        System.out.println("Yes");

    }
}
