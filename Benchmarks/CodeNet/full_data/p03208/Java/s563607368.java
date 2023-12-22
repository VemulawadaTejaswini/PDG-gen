import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1;
        line1 = sc.nextLine();
        String[] k_n_s = line1.split(" ");
        int N = Integer.parseInt(k_n_s[0]);
        int K = Integer.parseInt(k_n_s[1]);
        int[] kn = new int[N];
        for (int i=0;i<N;i++){
            kn[i] = Integer.parseInt(sc.nextLine());
        }
        // System.out.println("\n");
        Arrays.sort(kn);
        // System.out.println("=======");
        // for (int k:kn){
          // System.out.println(k);
        // }
        // final int INF = (int)Math.pow(10, 9) + 7;
        int min = 1000000000;
        int diff = 0;
        // int min = INF;

        for(int i=0;i<N-K+1;i++){
            diff = kn[K-1+i]-kn[i];
            if (min > diff){
                min = diff;
            }
        }
        // System.out.println("\n");
        // System.out.println("min:");
        System.out.println(min);
    }
}
