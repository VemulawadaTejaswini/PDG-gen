import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static String solve(int N, int[] A) {
        int n4 = 0; // 4の倍数
        int n1 = 0; // 2の倍数ではない
        for (int i = 0; i < N; i++) {
            if( A[i] % 4 == 0 ) {
                n4++;
            } else if( A[i] % 2 == 1 ) {
                n1++;
            }
        }

        // [1 4 1 4 と囲ってしまえる
        if( n4 >= n1 ) return "Yes";

        // [1 4 1] のように余計な1が邪魔をしないケース
        if( n1 == n4 + 1 && n1 + n4 == N ) return "Yes";

        return "No";
    }
}
