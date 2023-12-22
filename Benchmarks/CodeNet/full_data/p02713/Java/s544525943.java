import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k,n,m = 0,sum = 0;

        k = sc.nextInt();
        
        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    
                    n = a;
                    if(n < b) n = b;
                    if(n < c) n = c;
                    
                    for(int i = 1; i <= n; i++){
                        if((a % i == 0) && (b % i == 0) && (c % i == 0)){
                            m = i;
                        }
                    }
                    
                    sum += m;
                    
                }
            }
            
        }
        
        System.out.println(sum);
    }
}
