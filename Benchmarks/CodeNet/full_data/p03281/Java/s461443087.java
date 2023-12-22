import java.util.*;
 
class Main {
static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
	int n = scan.nextInt();  
    int count = 0;
    int ans = 0;
    
    for(int kisuu = 105; kisuu <= n ;kisuu += 2)
    {
      for(int yakusuu = 1 ;yakusuu <= n ; yakusuu++)
      {
      if( kisuu % yakusuu == 0){count += 1; }
      }
      if (count == 8){ans += 1; }
    }
    System.out.println(ans);
  }
}
