import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i< N; i++) A[i] = sc.nextInt();
        
        //食べたチョコ数を宣言・初期化
        int count = 0;
        for(int i = 0; i < N; i++){
          	//チョコを食べた日
            for(int j = 0; j*A[i] + 1 <= D; j++){
                count++;
            }
        }
        System.out.println(count + X);
    }
}
