import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
             int N = sc.nextInt();
             int[] A = new int[N];
             for ( int i = 0; i < N; i++ ) {
                 A[i] = sc.nextInt();
             }
             int answer = 0;
             for ( int i = 0; i < N; i++ ) {
                 int s = A[i];
                 if ( s == 0 ) {
                     answer++;
                 }
                 for ( int j = i + 1; j < N; j++ ) {
                     s += A[j];
                     if ( s == 0 ) {
                         answer++;
                     }
                 }
             }
             System.out.println(answer);
        };
    }
}