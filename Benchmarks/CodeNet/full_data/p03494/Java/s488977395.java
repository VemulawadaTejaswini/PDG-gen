import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N =  sc.nextInt();
        int[] A = new int[N];
        int ans = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            int count = 0;
            if(A[i]%2 != 0){
                ans = 0;
                break;
            }
            while(A[i]%2 == 0){
                A[i] /= 2;
                count++;
            }
            if(count > 0){
                if(ans == 0)
                    ans = count;
                else
                    ans = Math.min(ans, count);
            }
        }
        System.out.println(ans);
    }
}