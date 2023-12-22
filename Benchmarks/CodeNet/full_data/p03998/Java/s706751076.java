import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  String S_A = scan.next();
	  String S_B = scan.next();
	  String S_C = scan.next();
	  String[] S_Array = { S_A, S_B, S_C };
	  String[] S_NameArray = { "A", "B", "C" };
	  String turn = "A";
	  for( int i = 0 ;; i++ ) {
		  if( turn.equals( S_NameArray[i % 3] ) ) {
			  if( S_Array[i % 3].length() == 0 ) {
				  System.out.println( S_NameArray[i % 3] );
				  break;
			  }else {
				  String S_lead = S_Array[i % 3].substring(0, 1);
				  if( S_lead.equals("a") ) {
					  turn = "A";
				  }else if( S_lead.equals("b") ) {
					  turn = "B";
				  }else if( S_lead.equals("c") ) {
					  turn = "C";
				  }
				  S_Array[i % 3] = S_Array[i % 3].substring(1, S_Array[i % 3].length());
			  }
		  }
	  }
  }
}