import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int K = scan.nextInt();
                
                int[] cnt = new int[N+2];
                int ans = 0;
                
                int p = 0;
                int q = 0;
                for(int i=K; i<=N; i++){
                    for(int a=1; a<=i;i++){
                        p += a;
                    }
                    for(int b=N+1; b>=N+2-i;i--){
                        q += b;
                    }
                    cnt[i] = p-q+1;
                }
                
                for(int i=K; i<=N; i++){
                ans += cnt[i];
                }
                
                
                System.out.println(ans%(Math.pow(10, 9)+7));
                
	}
}