import java.util.*;
class coffee
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a strint of length 6:");
    String str=obj.nextLine();
    if(str.charAt(2)==str.charAt(3) && str.charAt(4)==str.charAt(5))
      System.out.println("yes");
    else
      System.out.println("No");
  }
}
    