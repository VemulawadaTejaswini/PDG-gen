import java.util.*;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;

        for(int i=1; i<=N; i++){
            ans = ans * i % 1000000007;
        }

        System.out.println(ans);
    }
}