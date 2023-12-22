import java.util.*;

public class Main {
public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for(int i = 0; i < s.length(); i++) {
      if(i != 0) {
        if(s.charAt(i-1) != s.charAt(i)) {
          System.out.println("YES");
		  break;
        }
	  }
        System.out.println("NO");
    }
}
}