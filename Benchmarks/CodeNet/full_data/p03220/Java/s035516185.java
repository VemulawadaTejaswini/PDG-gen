import java.util.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int [] a = new int[N];
    int [] temp = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
      temp[i] = T-a[i]*0.006;
      
    }
    int min =100;
    int ans = 0;
    for(int i=0;i<N;i++){
      x = Math.abs(A-temp[i]);
      if(x<min){
        min = x;
        ans = i;
      }
    }
    System.out.println(ans);
  }
}
                          
                         
                    
    
    
    
    
    
    
