import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

		  public static void main(String[] args) {
			     java.util.Scanner scanner = new java.util.Scanner(System.in);
			     String passcode = scanner.next();
			     String keyword = scanner.next();
				  int length = passcode.length() - keyword.length() + 1;
				  
				  boolean[] result = new boolean[length];
				  for (int i = 0; i < length; i++) {
					  for (int j = 0; j < keyword.length(); j++ ) {
						if (!charMatch(keyword.charAt(j), passcode.charAt(i + j))) {
							result[i] = true;
							break;
						}
					  }
				  }
				  List<String> results = new ArrayList<>();
				  
				  for (int i = 0; i < length; i++) {
					  if (result[i] == false) {
						  int start = i;
						  int end = i + keyword.length();
						  String tmp = passcode.substring(0, i) + keyword + passcode.substring(end, passcode.length());
						  results.add(tmp.replaceAll("\\?", "a"));
					  }
				  }
				  if (results.size() == 0) {
					  System.out.println("UNRESTORABLE");
				  } else {
					  Collections.sort(results);
					  System.out.println(results.get(0));
				  }
			  }
	  
		  
		  private static boolean charMatch(char keyword, char passcode) {
			  return (keyword == passcode || passcode == '?');
		  }
}