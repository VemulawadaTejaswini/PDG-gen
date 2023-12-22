import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h[] = new int[n + 1];
        int m[] = new int[n + 1];
        
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            m[i] = 0;
        }
        
        int innCounter = 0;
        
        
        for(int idx = 0; idx < n; idx++){
            if(idx == 0){
                innCounter++;
            }else{
                for(int k = 0; k < idx; k++){
                    if(h[idx] < h[k]){
                        m[idx]++;
                    }else{
                        
                    }
                    
                }
                if(m[idx] == 0){
                    innCounter++;
                }
            }
            
        } 
        System.out.println(innCounter);
        
    }
}
