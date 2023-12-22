import java.util.*;
public class Main {

    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.problemA_Flog1();
    }
}

class Problems {
    public static void problemA_Flog1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }
        int[] C = new int[N];
        C[0] = 0; C[1] = Math.abs(h[0]-h[1]);
        if (N == 2) {
            System.out.println(C[1]);
            return;
        }
        for (int i=2; i<N; i++) {
            C[i] = Math.min(C[i-2]+Math.abs(h[i]-h[i-2]),
                    C[i-1]+Math.abs(h[i]-h[i-1]));
        }
        System.out.println(C[N-1]);
    }
}