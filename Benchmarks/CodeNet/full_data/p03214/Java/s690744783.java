import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += a[i];
        }

        for (int i=0; i<N; i++) {
            a[i] = Math.abs(N * a[i] - sum);
        }

        int min = 999999;
        int ans = 0;
        for (int i=0; i<N; i++) {
            if (a[i] < min) {
                min = a[i];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
