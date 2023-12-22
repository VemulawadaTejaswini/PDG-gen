import java.lang.reflect.Array;
import java.util.*;
import static java.lang.Math.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weight = new int[N];
        int sum =0;
        int sum2 = 0;
        int[] g = new int[N];
      for(int j =0; int < N ; j++){
      weight[j] = sc.nextInt();
      }
        for(int t =1; t < N; t ++) {
            for (int i = 0; i < N; i++) {
                if (weight[i] <= t) {
                    sum += weight[i];
                } else if(weight[i] > t){
                    sum2 += weight[i];
                }
            }
            g[t] = Math.abs(sum - sum2);
        }
        Arrays.sort(g);
        System.out.println(g[0]);

    }
}