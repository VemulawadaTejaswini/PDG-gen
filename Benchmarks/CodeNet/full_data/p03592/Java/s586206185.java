import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= M; j++){
                if(i*N+j*M - N*M == K){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
   }
}