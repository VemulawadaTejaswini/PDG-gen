import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        int x=0;
        for(int i=0; i<N; i++){
            if(S.charAt(i)=='I'){
                x++;
            }else{
                x--;
            }
            ans=Math.max(ans,x);
        }
        System.out.println(ans);
    }
}