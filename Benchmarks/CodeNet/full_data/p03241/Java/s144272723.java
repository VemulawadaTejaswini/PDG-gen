import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int max = 0;
        for(int i=1;i*i<=m;i++){
            if(m%i==0){
                int p = m/i;
                if(p >=n){
                    max = Math.max(max, i);
                    
                }
                
                p = i;
                if(p >= n){
                    max = Math.max(max, m/i);
                }
            }
        }
        System.out.println(max);
     }
}