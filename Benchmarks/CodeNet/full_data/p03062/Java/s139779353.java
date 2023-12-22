import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[n];
        
        for(int i = 0; i<n; i++){
            v[i] = sc.nextInt();
        }
        
        int i = 0;
        
        if(0 <= i && i <= n-2){
                v[i] *= -1;
                v[i+1] *= -1;
            
            int sum = 0;
            
            for(int j : v){
                sum += j;
            }
            
            System.out.println(sum);
        
        }
        
    }
}
