import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int num = 0;
        
        for(int i=0; i<=N; i++){
            
            N = N-(int)Math.pow(K,i);
            
            if(N <= 0){
                    num = i;    
                    break;
                }
            
        }
        
        System.out.println(num+1);
        
    }
}
