import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    String n1 = s1.substring(0,1);
    String n2 = s2.substring(0,1);
    String n3 = s3.substring(0,1);
    String a = n1.toUpperCase();
    String b = n2.toUpperCase();
    String c = n3.toUpperCase();

    System.out.println(a+b+c);

  }

}
