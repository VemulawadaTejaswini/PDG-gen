import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long yen = 0;
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long a[] = new long[N];
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        while (M >= 0) {
            long min = a[0];
            int minA = 0;
            for (int i = 0; i < N; i++) {
                long var = a[i];
                if (var < min) {
                    min = var;
                    minA = i;
                }
            }
            while(b[minA] >= 0 || M >= 0){
                yen += a[minA];
                --b[minA];
                --M;
            }
        }
        System.out.println(yen);
    }
}