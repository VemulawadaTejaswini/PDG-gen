import java.util.*;
import java.util.regex.Pattern;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Boolean b = false;
    int n = Integer.parseInt(sc.next());
    String pattern = "^\\d{1}$";
    Pattern p = Pattern.compile(pattern);
    for(int i = 1; i < 10; i++) {
	  if(n % i == 0) {
        if(p.matcher(String.valueOf(n/i)).find()){
    		System.out.println("Yes");
            b = true;
		}
        if(b)
        break;
      }
    }
    if(!b){
      System.out.println("No");
    }
  }
}