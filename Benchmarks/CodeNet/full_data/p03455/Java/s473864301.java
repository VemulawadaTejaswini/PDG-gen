import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    sc.close();
    String ans[] = {"Odd", "Even"};
    int an = 0;
    if(a % 2 == 0 || b % 2 == 0)an = 1;
    System.out.println(ans[an]);
  }
}
