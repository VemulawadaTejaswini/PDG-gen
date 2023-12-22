import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int min = 1001;
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            int time = sc.nextInt();
            
            if(time<=t){
                min = Math.min(c, min);
            }
        }
        
        
        System.out.println(min>1000 ? "TLE" : min);
     }
}