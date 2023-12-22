import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    int[] list = new int[n];
     for(int i = 0; i < n ; ++i){
       list[i] = sc.nextInt();
     }
    
    
    int ans = 0;
    for(int i = 1; i < n ; ++i){
      if(list[i] <= t){
        int next = list[i] - list[i-1];
        ans += next;
      }else{
        ans += t;
      }
    }
    
    System.out.println(ans + t);
    
  }
  
}