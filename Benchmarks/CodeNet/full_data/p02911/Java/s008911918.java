import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        
        int i =0;
        
        int[] point = new int[N];
        
        for(i=0;i<point.length;i++){
            point[i] =K;
        }
        for(i=0;i<Q;i++){
            int answer =sc.nextInt();
            for(i=0;i<N;i++){
                if(i!=answer){
                point[answer -1]--;
                }
            }
            
        }
        for(i=0;i<N;i++){
            if(K-point[i]>=1){
                System.out.println("Yes");
            }
            else if(K-point[i]<=0){
                System.out.println("No");
            }
        }
        
        
    }
}