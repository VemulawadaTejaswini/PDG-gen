import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replace(" ", "");
    int i = Integer.parseInt(s);
    if ((i % 4) == 0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}