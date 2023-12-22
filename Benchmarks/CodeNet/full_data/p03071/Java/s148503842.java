import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ret = A+B;
    if (A > B) {
      ret = 2*A-1;
    } else if (A < B) {
      ret = 2*B-1; 
    }
    System.out.println(ret);
  }
}