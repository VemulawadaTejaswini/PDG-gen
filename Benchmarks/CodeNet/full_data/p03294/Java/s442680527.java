import java.util.*;

public class Main {
    
    static int N;
    static int[] A;
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        A = new int[N];
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans += sc.nextInt() - 1;
        }
        
        System.out.println(ans);
    }
}
