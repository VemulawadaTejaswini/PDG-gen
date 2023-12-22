import java.util.*;

class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Hs = new int[N];

        for (int i=0; i<N; i++) {
            Hs[i] = sc.nextInt();
        }

        int max = Hs[0];
        int result = 1;

        for (int i=1; i<N; i++) {
            if (Hs[i] >= max) {
                result++;
            }
            max = Hs[i] > max ? Hs[i] : max;
        }

        System.out.println(result);
    }
}
