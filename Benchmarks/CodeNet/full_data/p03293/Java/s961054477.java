import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    boolean flag = false;
    for(int i = 0; i < s.length(); i++)
    {
      for(int j = 0; j < s.length(); j++)
      {
        if(s.charAt(i) != t.charAt((i+j) % s.length()))
        {
          break;
        }
        flag = true; break;
      }
    }
    if(flag) System.out.println("Yes");
    else System.out.println("No");
  }
}
   