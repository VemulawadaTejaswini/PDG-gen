import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int val = (L-1)*N + (N*(N+1))/2 - eatval(N, L);
        System.out.println(val);
        sc.close();
    }

    static int eatval(int N, int L) {
        if(N < -L+1) 
            return L+N-1;
        else if(1 <= -L+1 && -L+1 <= N)
            return 0;
        else
            return L;
    }
}