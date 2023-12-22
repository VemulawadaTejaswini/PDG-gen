import java.util.*;

public class Main {
  public static void main(String args[]) {
  	Scanner sc = new Scanner(System.in);
    int a = nextInt();
    int b = nextInt();
    int c = nextInt();
    
    if (a <= c) {
      if (c <= b) {
      	System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}