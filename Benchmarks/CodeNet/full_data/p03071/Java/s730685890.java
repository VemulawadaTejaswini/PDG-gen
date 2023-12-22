import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    int s = 0;
    
    for (int i = 0; i < 2; i++) {
    	if (a > b) {
    		s += a--;
    	} else {
    		s += b--;
    	}
    }
    
    System.out.print(s);
    
  }
}
