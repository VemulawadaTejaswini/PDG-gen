import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int x;
    int y;
    int z;
    int as[] = new int[a];
    int bs[] = new int[b];
    int ms[] = new int[m];
    int ans = -1;
    
    for(int i = 0; i < a;i++) as[i] = sc.nextInt();
    for(int i = 0; i < b;i++) bs[i] = sc.nextInt();
    
   	for(int i = 0; i < m;i++){
      x = as[sc.nextInt()-1];
      y = bs[sc.nextInt()-1];
      z = x + y -sc.nextInt();
      
        if(ans == -1) ans = z;
        else if(z < ans) ans = z;
      	
    }
    
    System.out.println(ans);
  }
}
