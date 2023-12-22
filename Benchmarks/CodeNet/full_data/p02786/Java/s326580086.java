import java.util.*;
public class Solution
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = Math.floor(Math.log(2*n)/Math.log(2));
    t = Math.pow(2,t);
    System.out.println(t-1);
  }
}
    