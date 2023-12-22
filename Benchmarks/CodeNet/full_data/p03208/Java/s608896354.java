import java.util.*;
import java.util.Arrays;

public class Main {//ここが Main になっている
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1;
        line1 = sc.nextLine();
        String[] k_n_s = line1.split(" ");
        int N = Integer.parseInt(k_n_s[0]);
        int K = Integer.parseInt(k_n_s[1]);
        int [] kn = new int[N];
        for (int i=0;i<N;i++){
            kn[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(kn);
        for (int i : kn) {
            // System.out.println(i);
        }
        int min = 2147483647;
        int diff = 0;
        for(int i=0;i<N-K+1;i++){
            diff = kn[i+2]-kn[i];
            if (min > diff){
                // min_i
                // min_diff = diff
                min = diff;
            }
        }
        System.out.println(min);
    }
}
