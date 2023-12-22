import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
  	String s = sc.nextLine();
    boolean divi = true;
    while(divi) {
      divi = false;
      if(s.endsWith("eraser")) {
        divi = true;
        s -= "eraser";
      }
      if(s.endsWith("erase")) {
        divi = true;
        s -= "erase";
      }
      if(s.endsWith("dreamer")) {
        divi = true;
        s -= "dreamer";
      }
      if(s.endsWith("dream")) {
        divi = true;
        s -= "dream";
      }
    }
    if(s.length() == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}