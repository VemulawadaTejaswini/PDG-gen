import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    String S1 = S.substring(0,1);
    String S2 = S.substring(1,2);
    String S3 = S.substring(2,3);

    int count = 0;

    if (S1.equals("o")) {
      count++;
    }

    if (S2.equals("o")) {
      count++;
    }

    if (S3.equals("o")) {
      count++;
    }

    System.out.println(700 + (100 * count));

  }
}