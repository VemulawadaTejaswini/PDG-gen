import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n%2==0||n<104){
      System.out.println(0);
      return;
    }
	int ans = 0;
    int count = 0;
    for(int i = 1 ; i <= n ; ++i){ 
      if(n%i==0){
        count++;
      }
      if(i == n){
        if(count == 8){
          ans++;
          count = 0;
        }else{
          count = 0;
        }
      }
      
    }
    
    System.out.println(ans);
    
  }
}
