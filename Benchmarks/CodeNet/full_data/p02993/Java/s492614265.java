import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char[] S = sc.next().toCharArray();
	  
	  String output = "Good";
	  for(int i = 0; i < S.length-1; i++) {
		  if(S[i] == S[i+1]) {
			  output = "Bad";
			  break;
		  }
	  }
	  System.out.println(output);
	  
  }
}
