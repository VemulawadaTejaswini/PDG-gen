import java.util.Scanner;

/**
 * C - Low Elements
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int a = sc.nextInt();
        int p[] = new int[a];
        int result = 1;
        for( int i = 0; i < a; i++ ) {
            p[i] = sc.nextInt();
//            System.out.println("i : " + i);
            if( i != 0 ) {
                boolean cntJudgement = true;
                for( int j = i - 1; j >= 0; j-- ) {
//                    System.out.println("j : " + j);
//                    System.out.println("p[i] > p[j] : " + p[i] + " : " + p[j]);
                    if( p[i] >= p[j] ) {
                        cntJudgement = false;
                        break;
                    }
                }
                if( cntJudgement ) result++;
            }
        }

        System.out.println( result );

        sc.close();
    }
}