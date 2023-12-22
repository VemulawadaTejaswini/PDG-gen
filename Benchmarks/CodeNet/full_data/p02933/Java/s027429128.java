import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int s = sc.next();
    
    if (n < 3200) {
      System.out.println("red");
      return;
    } else {
      System.out.println(s);
      return;
    }
  }
}
