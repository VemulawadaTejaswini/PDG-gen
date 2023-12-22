import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int h[] = new int[n];
        
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        
        
        loop:
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                int H;
                
                if(h[0] > 0){
                    H = Math.abs(i-x[0]) + Math.abs(j-y[0]) + h[0];
                    
                    if(check(x, y, h, H, i, j)){
                        System.out.println(i+" "+j+" "+H);
                        break loop;
                    }
                }
                else{
                    for(H = 1; H<=Math.abs(i-x[0]) + Math.abs(j-y[0]);H++){
                        if(check(x, y, h, H, i, j)){
                            System.out.println(i+" "+j+" "+H);
                            break loop;
                        }
                    }
                }
                
                
            }
        }
        
    
     }
     
     static boolean check(int x[], int y[], int h[], int H, int cx, int cy){
         for(int i=1;i<x.length;i++){
             if(Math.max(H - Math.abs(cx - x[i]) - Math.abs(cy - y[i]), 0) != h[i]){
                 return false;
             }
         }
         
         return true;
     }
}