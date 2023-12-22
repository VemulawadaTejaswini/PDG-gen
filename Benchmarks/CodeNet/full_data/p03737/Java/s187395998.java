import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    
    String s1first = s1.substring(0, 1);
    String s2first = s2.substring(1, 2);
    String s3first = s3.substring(2, 3);
    
    String S1 = s1first.toUpperCase();
    String S2 = s2first.toUpperCase();
    String S3 = s3first.toUpperCase();
    
    System.out.println(S1 + S2 + S3);
  }
}