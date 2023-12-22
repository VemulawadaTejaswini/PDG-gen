import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int Lmax = 0;
        int Rmin = N;
        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt(); 
            Lmax = Math.max(Lmax, L[i]);
            Rmin = Math.min(Rmin, R[i]);
        }
        System.out.println(Lmax <= Rmin ? Rmin - Lmax + 1 : 0);
    }
}