import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int a = 0;
    for(int i = 0; i < n; i ++) {
      if(s.charAt(i) != s.charAt(i + 1)) {
        a ++;
      }
    }
    System.out.println(a);
  }
}