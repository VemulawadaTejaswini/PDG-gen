import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    char op = sc.nextchar();
    int b = sc.nextInt();

    System.out.println(op=='+' ? a+b:a-b);
  }
}
