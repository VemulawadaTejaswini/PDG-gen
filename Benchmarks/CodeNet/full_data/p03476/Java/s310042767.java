import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int MAX = 100001;
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i=2; i<MAX; i++){
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    prime[i] = false;
                    break;
                }
            }
        }
        
        boolean[] likeNum = new boolean[MAX];
        Arrays.fill(likeNum, false);
        
        for(int i=1; i<MAX; i+=2){
            if(prime[i] && prime[(i+1)/2]){
                likeNum[i] = true;
            }
        }
        
        
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            for(int j=l; j<=r; j+=2){
                if(likeNum[j]){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}