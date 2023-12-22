import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int ans=0;
        
        if(K%2==0){
            int num=(N+K/2)/K;
            ans+=(num*num*num);
        }
        
        
        int num=N/K;
        ans+=(num*num*num);
        
        System.out.println(ans);
    }
}
