import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    int ans = maxStrings(str);
    System.out.println(ans);
  }
  
  public static int maxStrings(String str)
  {
    int count = 1;
    boolean flag = false;
    
    for(int i=1;i<str.length();)
    {
      if((str.charAt(i) == str.charAt(i-1)) && flag == false)
      {
        count++;
        i+=2;
        flag = true;
        continue;
      }
      
      i++;
      count++;
      flag = false;
    }
    return count+1;
  }
  
}
