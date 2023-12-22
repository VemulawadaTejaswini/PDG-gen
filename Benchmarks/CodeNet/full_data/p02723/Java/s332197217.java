import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    String ff = N.substring(2,4);
    String ee = N.substring(4,6);
    if(ff.substring(0,1).equals(ff.substring(1,2)) && ee.substring(0,1).equals(ee.substring(1,2))){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
  }
