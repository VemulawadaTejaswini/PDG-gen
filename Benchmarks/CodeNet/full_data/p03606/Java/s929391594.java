import java.util.*;

public class Main {          
    
  public static void main(String[] args) {
   
     Scanner sc = new Scanner(System.in);          
    
     int MAX = 100002;
     
     int a[] = new int[MAX];
             
     int N = sc.nextInt();
     
     for(int i = 0;i < N;i++){
         int l = sc.nextInt();
         int r = sc.nextInt();
         a[l]++;
         a[r+1]--;         
     }
    
     for(int i = 0;i < MAX - 1;i++){
         a[i+1] += a[i];
     }
     
     int ans = 0;
     
     for(int i = 1;i < MAX - 1;i++){
         if(a[i] > 0){
             ans++;
         }
     }
     
     System.out.println(ans);
     
  }                            
}