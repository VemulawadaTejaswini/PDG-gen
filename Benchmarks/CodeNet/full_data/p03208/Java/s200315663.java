import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int h[] = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int min = Integer.MAX_VALUE;
        for (int i = K - 1; i < N; i++) {
            int l = i - K + 1;
            if (min > h[i] - h[l]) {
                min = h[i] - h[l];
            }
        }
        System.out.println(min);
    }
}