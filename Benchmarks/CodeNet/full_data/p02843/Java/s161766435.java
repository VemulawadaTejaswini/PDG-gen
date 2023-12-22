import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
  int a = n / 100;
  int b = n - 100 * a;
  int c = a * 5;
  if ( b < c ){ 
    System.out.println(1);
  } else {
      System.out.println(0);
    }
}