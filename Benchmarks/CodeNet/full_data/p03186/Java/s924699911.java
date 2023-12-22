import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        int N = sc.nextInt();
        //        int[] A = new int[N];
        //        for (int i = 0; i < N; i++) {
        //            A[i] = sc.nextInt();
        //        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(C <= (A + B) ? (C + B) : (A + B + B + 1));
        sc.close();
    }
}