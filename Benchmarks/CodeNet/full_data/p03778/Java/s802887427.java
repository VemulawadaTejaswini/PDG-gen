import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

	
	int x  = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();
    
    System.out.println(Math.max(0,Math.abs(x-y)-z));
    
    
  }
}