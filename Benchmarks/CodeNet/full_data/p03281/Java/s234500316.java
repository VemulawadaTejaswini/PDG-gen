
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int count;
    int ans = 0;
    
    
    for(int i = 1; i < N; i+=2){
        count = 0;
        for(int j = 1; j <= i; j++){
            // 約数の個数を計算し、カウントする
            if((i % j) == 0){      
                count++;
                if(count == 8){
                    ans++;
                }
            }
        }
    }    
        System.out.println(ans);
    }
}
