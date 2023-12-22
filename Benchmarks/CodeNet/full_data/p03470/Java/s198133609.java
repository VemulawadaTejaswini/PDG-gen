import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    
    for(int i = 0; i < n; i++){
      d[i] = sc.nextInt();
    }
    
    Arrays.sort(d);
    
    int ans = 1;
    for(int i = 1; i < n; i++){
      if(d[i-1] != d[i]){
        ans++;
      }
    }
   
    System.out.println(ans);
    
  }
}