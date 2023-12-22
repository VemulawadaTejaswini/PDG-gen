import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char S[] = sc.next().toCharArray();
        
        int ans = 0;
        for( int i = 1; i < N; i++ ) {
            
            int anst = 0;
            boolean l[] = new boolean[26];
            boolean r[] = new boolean[26];
            
            
            for( int j = 0; j < i; j++ ) {
                int x = S[j] - 97;
                l[x] = true;
            }
            
            for( int k = i; k < N; k++ ) {
                int x = S[k] - 97;
                r[x] = true;
            }
            
            for( int x = 0; x < 26; x++ ) {
                if( l[x] && r[x] ) {
                    anst++;
                }
            }
            
            ans = Math.max(ans, anst);
        }
        System.out.println(ans);
    }
}
