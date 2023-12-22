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
        
        int len[] = new int[M-1];
        for(int i = 0; i < M; i++) {
            len[i] = Math.abs(X[i + 1] - X[i]);
        }
        int sub = M - N;
        if(sub <= 0) {
            System.out.println("0");
            return;
        }
        int lm[] = maxi(len, N);
        int t = max(len);
        int f = min(len);
        int gsd = 0;
        for(int r = 0;r < lm.length; r++) {
            gsd += lm[r];
        }
        System.out.println(t - f -gsd);
        
    }
    
    private static int[] maxi(int[] a, int n) {
        int j[] = new int[n];
        for(int k = 0; k < j.length; k++) {
            j[k] = k;
        }
        for(int i = 0; i < a.length; i++) {
            for(int t = 0; t < j.length; t++) {
                if(a[j[t]] < a[i]) {
                    j[t] = i;
                }
            }
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
            if(a[maxi] < a[i]) {
                maxi = i;
            }
        }
        return a[maxi];
    }


}