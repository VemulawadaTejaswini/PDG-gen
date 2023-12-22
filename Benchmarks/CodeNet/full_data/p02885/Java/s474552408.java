import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int answer = A - B * 2;
    
    if(answer > 0) {
      System.out.println(answer);
    } else {
      System.out.println(0);
    }
  }
}
