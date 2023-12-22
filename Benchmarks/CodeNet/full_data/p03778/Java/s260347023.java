import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

	
	int z  = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    System.out.println(Math.max(0,Math.abs(x-y)-z));
    
    
  }
}