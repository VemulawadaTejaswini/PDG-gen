import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    
    int i = 1;
    int j = n;
    
    int min = i + j - 2;
    
    for(int x = 1; x <= n; x++) {
	    for(int y = 1; y * x <= n; y++) {
          if(x * y == n && (x + y - 2) < min) {
            min = x + y - 2;
          }
        }
    }
    
    System.out.println(min);
    }
    
  }