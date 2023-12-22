import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count =0;
    
   for (int j = 0; j < S.length(); j++) {
    if (S.contains("ABC")) {
        count++;
    }
  }
    System.out.println(count/3);
}
}