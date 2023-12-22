import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N;
        for(int n=1; n<=Math.min(110000, N); n++) if(N%n==0){
            ans = Math.min(ans, n+(N/n)-2);
        }
        System.out.println(ans);
    }
}
