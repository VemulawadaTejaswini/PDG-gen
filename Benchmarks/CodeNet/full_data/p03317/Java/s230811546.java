import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int i = 0;i < N;i++)    sc.nextInt();
        if(N == K){
            System.out.println(1);
            return;
        }
        int ans = N/(K-1);
        if(N%(K-1) != 0)    ans++;
        System.out.println(ans);
    }
}