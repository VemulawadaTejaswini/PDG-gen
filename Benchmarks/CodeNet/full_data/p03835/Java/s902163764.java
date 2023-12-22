import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC051B - Sum of Three Integers

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();   // 2 <= k <= 2500
        int s = sc.nextInt();   // 0 <= s <= 3k

        List<int[]> ptn = new ArrayList<int[]>();
        for (int j = 0; j <= k; j++) {
            setPtn(k, 0, j, new int[2], ptn);
        }
//        ptn.stream().limit(1000).forEach(l -> System.out.println(Arrays.toString(l)));
        
        int count = 0;
        for (int[] idx :ptn) {
            if (s - (idx[0] + idx[1]) <= k) count++;
        }
        System.out.println(count);
    }

    static void setPtn(int a, int d, int c, int[] idx, List<int[]> ptn) {
        idx[d] = c;
        if (idx.length - 1 > d) {
            for (int l = 0; l <= a; l++) {
                setPtn(a, d + 1, l, idx, ptn);
            }
        } else {
            int[] tmpidx = idx.clone();
            ptn.add(tmpidx);
        }
    }
}