import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = N;
        
        for(int i=1; i<N; i++){
            if(S.charAt(i)==S.charAt(i-1)){
                ans -= 1;
            }
        }
        System.out.println(ans);
    }
}