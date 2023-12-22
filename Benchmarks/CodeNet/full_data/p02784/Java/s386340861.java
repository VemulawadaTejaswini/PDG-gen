import java.util.*;

class Main{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int n = scan.nextInt();

    int a = scan.nextInt();  
    
    int t = 0;
    
    for (int i = 0; i <= n; i++){ 
      
      t = t + a;
    }
      
		if(h <= t){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
  }
}
    
    