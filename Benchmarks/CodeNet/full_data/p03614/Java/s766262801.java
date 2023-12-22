import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] p = new int[N + 1];

        for(int i=1; i<=N; i++){
            p[i] = sc.nextInt();
        }

        int ans = 0;
        if(p[1]==1){
            ans += 1;
        }
        for(int i=2; i<N; i++){
            if(p[i]==i){
                ans += 1;
                if(p[i-1]==i-1 && p[i+1]!=i+1){
                    ans -= 1;
                }
            }
        }
        if(p[N]==N){
            ans += 1;
            if(p[N-1]==N-1){
                ans -= 1;
            }
        }
        System.out.println(ans);
    }
}