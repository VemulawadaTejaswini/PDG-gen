import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long result = 0;
        int N;
        String S;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();
        }
        int[] iS = new int[N];
        char[] c = S.toCharArray();
        for(int i = 0;i < N;i++){
            iS[i] = c[i]-0x30;
        }

        int[] pre =new int[N];
        int[] post = new int[N];
        int[] count = new int[10];

        int[] preIndex = new int[10];
        for (int i = 0; i < 10; i++) {
            preIndex[i] = -1;
        }

        Set<Integer> set = new HashSet<>(10);
        for (int i = 0; i < N; i++) {
            set.add(iS[i]);
            pre[i] = set.size();
        }
        set = new HashSet<>(10);
        for (int i = N-1; i >= 0; i--) {
            set.add(iS[i]);
            post[i] = set.size();
        }
        for(int i = 1; i < N -1;i++){
            int num = iS[i];

            if (preIndex[num] ==-1){
                count[num] =pre[i -1] * post[i+1];
            }else{
                int q = post[i+1];
                int s = pre[preIndex[num]-1];
                int r = pre[i-1];
                count[num] += (r - s) * q;
            }
            preIndex[num] = i;
        }
        for(int i : count){
            result += i;
        }
        System.out.println(result);
        return;
    }
}
