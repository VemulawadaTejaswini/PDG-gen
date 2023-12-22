import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    int count = b - a;
    
    int h = 0;

    for (int i = 1; i <= count; i++) {
      h += i;
    }
    
    System.out.println(h - b);
    
  }

}