import java.util.*;
import java.util.stream.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] char_ary = str.toCharArray();
    
    char unbalance = 0;
    
    int max = -1;
    int idx = -1;
    
    for(int i = 0; i < char_ary.length; i++)
    {
    	int cnt = 0;
      	char c = char_ary[i];
    	for(int k = 0; k < char_ary.length; k++)
        {
        	if(c == char_ary[k])
              cnt++;
        }
      	if(cnt >= (char_ary.length / 2) && cnt > max)
        {
          	unbalance = c;
        	idx = i + 1;
          	max = cnt;
        }
    }
    
    if(max > 0)
      System.out.println(idx + " " + (str.lastIndexOf(unbalance) + 1));
    else
      System.out.println("-1 -1");
  }
}