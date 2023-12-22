import java.util.*;

public class Main {    
    
  public static void main(String[] args) {              
     Scanner sc = new Scanner(System.in);                
     
     int N = sc.nextInt();
     
     int x = sc.nextInt();
     
     int a[] = new int[N];
     
     for(int i = 0;i < N;i++){
         a[i] = sc.nextInt();
     }
     
     int sum = 0;
     for(int i = 0;i < N - 1;i++){
         if(a[i] + a[i+1] > x){
            int n = a[i] + a[i+1] - x;
            a[i+1] = a[i+1] - n;    
            sum += n;
         }                           
     }
     
     System.out.println(sum);
     
  }          
}