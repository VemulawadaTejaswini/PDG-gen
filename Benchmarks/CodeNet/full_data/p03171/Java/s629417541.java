import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int left = 0;
        int right = N-1;

        long taro = 0;
        long jiro = 0;
        for (int i=0;i<N;i++) {
            if (left==right) {
                if (i%2==0) taro+=a[left];
                if (i%2==1) jiro+=a[left];
                break;
            }
            long tmp_l = a[left]-Math.max(a[left+1], a[right]);
            long tmp_r = a[right]-Math.max(a[left], a[right-1]);
            if (tmp_l>=tmp_r) {
                if (i%2==0) taro+=a[left];
                if (i%2==1) jiro+=a[left];
                left++;
            } else {
                if (i%2==0) taro+=a[right];
                if (i%2==1) jiro+=a[right];
                right--;
            }
        }
        System.out.println(taro-jiro);
    }
}