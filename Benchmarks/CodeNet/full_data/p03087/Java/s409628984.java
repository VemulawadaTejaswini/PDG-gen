import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    for (int i = 0;i < q;i ++) {
      System.out.println(s.substring(sc.nextInt()-1,sc.nextInt()).split("AC", -1).length -1);
    }
  }
}