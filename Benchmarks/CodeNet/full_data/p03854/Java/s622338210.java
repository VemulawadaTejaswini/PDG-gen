import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S_input = scan.next();
	  String S = "";
	  String T = "";
	  String[] revStrArray = { "remaerd", "resare", "esare", "maerd" };
	  int SLen = S_input.length();
	  for( int i = 0; i < SLen; i++ ) {
		  S += S_input.substring( SLen - i - 1, SLen - i );
	  }

	  for( int i = 0; i < SLen; i++ ) {
		  boolean isRemove = false;
		  for( int j = 0; j < revStrArray.length; j++ ) {
			  int revStrLen = revStrArray[j].length();
			  if( i + revStrLen <= SLen ) {
				  if( S.substring( i, i + revStrLen ).equals( revStrArray[j] ) ) {
					  T += revStrArray[j];
					  isRemove = true;
					  i += revStrLen;
					  i--;
				  }
			  }
			  if( isRemove )break;
		  }
	  }
	  if( S.equals( T ) ) {
		  System.out.println( "YES" );
	  }else {
		  System.out.println( "NO" );
	  }
  }
}
