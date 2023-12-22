import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    char[] op = sc.next().toCharArray();
    int b = sc.nextInt();

    

    System.out.println(op[0]=='+' ? a+b:a-b);
  }
}