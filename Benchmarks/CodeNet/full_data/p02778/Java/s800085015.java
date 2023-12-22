import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S = scan.next();
	  int strLen = S.length();
	  String ans = "";
	  for( int i = 0; i < strLen; i++ )ans += "x";
	  System.out.println(ans);
  }
}