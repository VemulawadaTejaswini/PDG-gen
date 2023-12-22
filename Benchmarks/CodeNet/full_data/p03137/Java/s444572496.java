import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X[] = new int[M];
        for(int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);

        List<Integer> len = new ArrayList<>();
        for(int i = 0; i < M - 1; i++) {
            len.add(Math.abs(X[i + 1] - X[i]));
        }
        int sub = M - N;
        if(sub <= 0) {
            System.out.println("0");
            return;
        }
        int lm[] = maxi(len, N);
        int t = max(X);
        int f = min(X);
        int gsd = 0;
        for(int r = 0;r < lm.length; r++) {
            gsd += lm[r];
        }
        System.out.println(t - f -gsd);

    }

    private static int[] maxi(List<Integer> a, int n) {
        int j[] = new int[n];
        Collections.reverse(a);
        for(int k = 0; k < n; k++) {
            j[k] = a.get(k);
        }
        return j;
    }

    private static int max(int[] a) {
        int maxi = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[maxi] < a[i]) {
                maxi = i;
            }
        }
        return a[maxi];
    }

    private static int min(int[] a) {
        int maxi = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[maxi] > a[i]) {
                maxi = i;
            }
        }
        return a[maxi];
    }


}