import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String ret = "Yes";
    if (a == b && b == c) {
      ret = "No";
    } else if(a != b && b != c) {
      ret = "No"; 
    }
    System.out.println(ret);
  }
}