import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        sc.close();
        S = 'R'+S+'L';
        int ans = 0;
        for(int i=1;i<=N;i++){
            int p = 0;
            if(S.charAt(i) == 'R') p = i+1;
            else p = i-1;
            if(S.charAt(i) == S.charAt(p)) ans += 1;
        }
        System.out.println(Math.min(ans+2*K,N-1));
    }
}