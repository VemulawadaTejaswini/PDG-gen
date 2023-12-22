import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int A[] = new int[a];
        int B[] = new int[b];
        int C[] = new int[c];

        for (int i = 0; i < a; i ++) {
                A[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i ++) {
                B[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i ++) {
                C[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int P[] = new int[x];
        int Q[] = new int[y];
        for (int i= 0; i < x; i++) {
            P[i] = A[a-1-i];
        }
        for (int i= 0; i < y; i++) {
            Q[i] = B[b-1-i];
        }

        int ans = 0;
        int need[] = new int[x+y+c];
        System.arraycopy(P,0,need,0,P.length);
        System.arraycopy(Q,0,need,P.length,Q.length);
        System.arraycopy(C,0,need,P.length+Q.length,C.length);

        Arrays.sort(need);

        for (int i = 0; i < x + y; i++) {
            ans += need[x + y + c - 1 - i];
        }
        System.out.println(ans);
    }
}