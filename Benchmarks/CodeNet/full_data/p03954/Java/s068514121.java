import java.util.Scanner;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_d
 * 
 * @author Cummin
 */
public class Main {
    
    static int N ;
    static int M[] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = new int[N*2-1] ;
        for (int i=0 ; i<(N*2-1); i++) {
            M[i] = sc.nextInt() ;
        }
        System.out.println(N);
    }
}
