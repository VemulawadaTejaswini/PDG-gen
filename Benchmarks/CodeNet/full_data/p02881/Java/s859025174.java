import java.util.*;

public class Sample {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    
    int i = 1;
    int j = n;
    
    int min = i + j - 2;
    
    for(int x = 1; x <= n; x++) {
	    for(int y = 1; y <= x; x++) {
          if(x * y == n && (x + y - 2) < n) {
            min = x + y - 2;
          }
        }
    }
    
    System.out.println(min);
    }
    
  }
  
