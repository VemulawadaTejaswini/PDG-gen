import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tr = sc.nextInt();
    int ta = sc.nextInt();
    
    if(n*tr >= ta)
    {
      System.out.println(ta);
    }
    else
      System.out.println(n*tr);
  }
}
  