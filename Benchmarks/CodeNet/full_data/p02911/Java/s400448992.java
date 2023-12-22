import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] group = new int[N];
        for ( int i = 0; i < N; i++ ){
            group[i] = K;
        }
        for ( int j = 0; j < Q; j++ ){
            int A = sc.nextInt();
            for ( int i = 0; i < N; i++ ){
                if ( i != A-1 ){
                    group[i] = group[i] - 1;
                }
            }
        }
        for ( int i = 0; i < N; i++ ){
            if (group[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}