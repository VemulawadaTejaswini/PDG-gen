import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        int count = 0;
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            count += count2(a[i]);
        }
        System.out.println(count);
    }
    static int count2(long a) {
        int count = 0;
        if(a % 2 != 0) {
            return count;
        }else {
            while(true) {
                a /= 2;
                count++;
                if(a % 2 != 0) {
                    return count;
                }
            }
        }
    }
}
