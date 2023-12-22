import java.util.Arrays;
import java.util.Scanner;

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
        long A[] = new long[a];
        long B[] = new long[b];
        long C[] = new long[c];

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

        int temp = 0;

        for (int i= 0; i < x; i++) {
        	temp = a-1-i;
            C[x+i] = A[temp];
        }
        for (int i= 0; i < y; i++) {
        	temp = b-1-i;
        	C[x+y+i] = B[temp];
        }

        long ans = 0;
        Arrays.sort(C);

        for (int i = 0; i < x + y; i++) {
            ans += C[x + y + c - 1 - i];
        }
        System.out.println(ans);
    }
}