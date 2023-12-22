import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    boolean no_t = false;
    for(int i = 0; i < line.length(); i++){
      String one = line.substring(i, i + 1);
      if((i + 1) % 2 == 0) {
        if(!one.equals("L") && !one.equals("U") && !one.equals("D")) {
          System.out.println("No");
          no_t = true;
        }
      } else {
        if(!one.equals("R") && !one.equals("U") && !one.equals("D")) {
          System.out.println("No");
          no_t = true;
        }
      }
    }
    if(!no_t) {
       System.out.println("Yes");
    }
  }
}