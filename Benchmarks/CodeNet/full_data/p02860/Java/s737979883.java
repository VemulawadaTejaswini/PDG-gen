import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = input.next();
    if(n%2!=0)
    {
      System.out.println("No");
    }
    else{
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++)
      {
        char c = s.charAt(i);
        if(map.containsKey(c))
        {
          int p = map.get(c);
          p++;
          map.put(c,p);
        }
        else
          map.put(c,1);
      }
      boolean flag = true;
      for(char c:map.keySet())
      {
        if(map.get(c)%2==0)
          flag = true;
       	else{
          flag = false;
          break;
        }
      }
      if(flag)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}