import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();

    String Ae = A.substring(A.length() - 1);
    String Bs = B.substring(0,1);
    String Be = B.substring(B.length() - 1);
    String Cs = C.substring(0,1);

    if ((Ae.equals(Bs)) && (Be.equals(Cs))) { 
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}