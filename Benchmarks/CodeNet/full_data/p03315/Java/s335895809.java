import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    String S1 = S.substring(0,1);
    String S2 = S.substring(1,2);
    String S3 = S.substring(2,3);
    String S4 = S.substring(3,4);

    int count = 0;

    if (S1.equals("+")) {
      count++; 
    } else {
      count--; 
    }

    if (S2.equals("+")) {
      count++; 
    } else {
      count--; 
    }

    if (S3.equals("+")) {
      count++; 
    } else {
      count--; 
    }

    if (S4.equals("+")) {
      count++; 
    } else {
      count--; 
    }

    System.out.println(count);

  }
}