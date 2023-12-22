import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String a = input.next();
    String b = input.next();
    for(int i=0;i<n;i++)
      System.out.print(a.charAt(i)+""+b.charAt(i));
  }
}