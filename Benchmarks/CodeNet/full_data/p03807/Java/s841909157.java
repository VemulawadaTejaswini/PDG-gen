import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long o=0;
        long e=0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            if(A[i]%2==0){
            e++;
            }else{
            o++;
            }
        } 
    if(o%2==0){
    System.out.println("YES");
     }else{
    System.out.println("NO");
}
    }
}
