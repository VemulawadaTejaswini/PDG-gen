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
        long [] kn = new long[N];
        for (int i=0;i<N;i++){
            String a = sc.nextLine();
            kn[i] = Long.parseLong(a);
            // System.out.println(kn[i]+" "+a);
            // System.out.println(i);
        }
        Arrays.sort(kn);
        System.out.println("=============");
        for (int i=0;i<N;i++){
            System.out.println(i+":"+kn[i]);
        }

        Long min = 1000000000L;
        Long diff = 0L;
        for(int i=0;i<N-K+1;i++){
            diff = kn[i+2]-kn[i];
            if (min > diff){
                min = diff;
            }
        }
        System.out.println("ans: "+min);
    }
}
