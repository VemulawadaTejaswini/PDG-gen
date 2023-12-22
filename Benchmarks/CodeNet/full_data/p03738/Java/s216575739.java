import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int stack_a;
    int stack_b;
    int judge = -1;

    if(a.equals(b)) judge = 0;
    else if(a.length() > b.length()) judge = 1;
    else if(a.length() < b.length()) judge = 2;
   	else if(a.length() == b.length()){
      for(int i = 0; i < a.length() && judge == -1; i++){
        stack_a = (int)a.charAt(i) - 48;
        stack_b = (int)b.charAt(i) - 48;
        if(stack_a > stack_b) judge = 1;
        else if(stack_a < stack_b) judge = 2;
      }
    }
    
    if(judge == 0) System.out.println("EQUAL");
    else if(judge == 1) System.out.println("GREATER");
    else if(judge == 2) System.out.println("LESS");
  }
}
