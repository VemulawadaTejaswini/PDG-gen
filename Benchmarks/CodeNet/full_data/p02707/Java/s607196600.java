import java.util.Scanner;

/**
 * C - management
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 社員数
        int n = sc.nextInt();
        // 社員番号
        int[] a = new int[n];
        for( int i = 1; i < n; i++ ) {
            int member = sc.nextInt();
            a[member - 1]++;
        }

        // 結果：それぞれの直属の部下の人数
        for( int i = 0; i < n; i++ ) {
            System.out.println( a[i] );
        }

        sc.close();
    }
}
