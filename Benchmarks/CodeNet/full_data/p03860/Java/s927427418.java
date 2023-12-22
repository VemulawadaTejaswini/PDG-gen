import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S1 = sc.next();
    String S2 = sc.next();
    String S3 = sc.next();

    System.out.println( S1.substring(0,1) + S2.substring(0,1) + S3.substring(0,1)  );
  }
}
