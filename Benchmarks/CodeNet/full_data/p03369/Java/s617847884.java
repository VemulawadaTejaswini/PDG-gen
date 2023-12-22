import java.util.Scanner;
class Main {
  public static void main(String Args[]) {
    String s;
    int c = 0;
    
    Scanner sc = new Scanner(System.in);
    s = sc.next();
    for (int i = 0;i < 3;i++) {
      if (s.charAt(i) == 'o')
        c++;
    }
    
    System.out.println(c * 100 + 700);
    return;
  }
}