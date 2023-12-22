import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h[] = new int[n + 1];
        
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        
        int innCounter = 0;
        
        int m = 0;
        
        for(int x = 0; x < n; x++){
            if(x == 0){
                innCounter++;
            }else{
                for(int k = x; k >= 0; k--){
                if(h[x] < h[k]){
                    break;
                }else{
                    m++;
                }
                if(m == x){
                    innCounter++;
                }
                k--;
                }
            }
            
        } 
        System.out.println(innCounter);
        
    }
}