import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S = scan.next();
	  String T = S;
	  while( T.contains("dreamer") ) {
		  T = T.replace( "dreamer", "" );
	  }
	  while( T.contains("eraser") ) {
		  T = T.replace( "eraser", "" );
	  }
	  while( T.contains("erase") ) {
		  T = T.replace( "erase", "" );
	  }
	  while( T.contains("dream") ) {
		  T = T.replace( "dream", "" );
	  }
	  while( T.contains("aser") ) {
		  T = T.replace( "aser", "" );
	  }
	  //System.out.println(T);
	  if( T.equals("") ) {
		  System.out.println("YES");
	  }else {
		  System.out.println("NO");
	  }
  }
}
