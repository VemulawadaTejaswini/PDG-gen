import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()+1;
        int init = in.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n-1; i++) x[i] = in.nextInt();
        x[n-1] = init;
        Arrays.sort(x);

        int[] gaps = new int[n-1];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int gap = x[i] - x[i-1];
            if(gap != 0) min = Math.min(min, gap);
            gaps[i-1] = gap;
        }

        boolean cond = true;
        for(int i = 0; i < n-1; i++) {
            if(gaps[i] == 0) continue;
            if(gaps[i] % min != 0) {
                cond = false;
                break;
            }
        }

        if(cond) {
            System.out.println(min);
        }else{
            System.out.println(1);
        }
    }
}