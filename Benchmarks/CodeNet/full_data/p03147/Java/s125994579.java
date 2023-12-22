import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        int[] hi = new int[N];
        int status = 0;//0:none 1:start 2:end
        int result = 0;
        boolean judged = false;
        while ( !equal(hi, h)) {
            for (int i = 0; i < N; i++) {
                if (status == 0 && hi[i] < h[i] && !judged) {
                    status = 1;
                    result++;
                    hi[i]++;
                    //System.out.println(i + " a");
                    judged = true;
                }
                if (status == 1 && hi[i] < h[i] && !judged) {
                    hi[i]++;
                    //System.out.println(i + "b");
                    judged = true;
                }
                if (status == 1 && hi[i] >= h[i] && !judged) {
                    status = 2;
                    //System.out.println(i + "c");
                    judged = true;
                }
                judged = false;
                //System.out.println(result);
            }
            status = 0;
            //System.out.println(result);
        }
        System.out.println(result);
    }

    static boolean equal(int[] a, int[] b) {
        boolean result = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                result = false;
                break;
            }
            //System.out.print(a[i] + " ");
        }
        //System.out.println(result);
        return result;
    }
}