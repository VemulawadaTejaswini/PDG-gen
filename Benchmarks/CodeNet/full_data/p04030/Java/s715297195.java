import java.util.Scanner;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	LinkedList<Character> stack = new LinkedList<>();
    String s = sc.next();
    String res = "";
    
    for (int i = 0; i < s.length(); i++) {
    	if (s.charAt(i) == 'B') {
          if (!stack.isEmpty()) {
          	stack.pop();
          }
        } else {
        	stack.push(s.charAt(i));
        }
    }
                       
    while (!stack.isEmpty()) {
      res = stack.pop() + res;
    }
                       
    System.out.println(res);
  }
}
