import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long t = (long)Math.floor(Math.log(2*n)/Math.log(2));
    t = (long)Math.pow(2,t);
    System.out.println(t-1);
  }
}
    
