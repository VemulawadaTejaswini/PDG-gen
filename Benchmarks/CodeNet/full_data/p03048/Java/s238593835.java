import java.util.*;

class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int ans = 0;
    
    for(int i = 0; i <= n; i++){
	  for(int j = 0; j <= n; j++){
        if((n - r * i - g * j) % b == 0) ans++;
      }
    }
    
    System.out.println(ans);
    
  }
  
}
