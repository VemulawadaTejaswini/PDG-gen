import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	String s = scan.next() ;
    String s2 = s.substring(s.indexOf('A') , s.lastIndexOf('Z')+1);
    
    
    System.out.println(s2.length());
  }
}
