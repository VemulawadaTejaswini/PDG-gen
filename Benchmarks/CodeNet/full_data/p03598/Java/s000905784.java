
import java.util.*;
public class Main {
    public static void main(String[] args){
        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
        }
        // 出力
        int sum = 0;
        int minDist;
        for(int i=0;i<N;i++){
            minDist = Math.min(x[i], K-x[i]);
            sum += minDist;
        }
        System.out.println(2*sum);
    }
}

