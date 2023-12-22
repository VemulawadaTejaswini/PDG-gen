import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Boolean b = false;
    int n = Integer.parseInt(sc.next());
    String pattern = "[1-9]";
    Pattern p = Pattern.compile(pattern);
    for(int i = 1; i < 10; i++) {
	  if(n % i == 0) {
        if(p.matcher(String.value(n/i)).find()){
    		System.out.println("Yes");
            b = true;
		}
        if(b)
        break;
      }
    }
    if(!b)
      System.out.println("No");