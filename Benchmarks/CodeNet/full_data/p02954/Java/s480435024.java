import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] ch = s.toCharArray();
    int cnt[] = new int[ch.length];
    for(int i = 0;i<ch.length;i++)
    {
      char before = ch[i];
      int mvcount = 0;
      int pos = i;
      while(true)
      {
        char now = ch[pos];
        if(!(now==before))
        {
          if(mvcount%2==0)
          {
            cnt[pos]++;
            break;
          }
          else
          {
            if(now=='R')
            {
              cnt[pos+1]++;
              break;
            }
            else if(now=='L')
            {
              cnt[pos-1]++;
             break; 
            }
          }
        }
        before = now;
        if(now=='R'){pos++;}
        else if(now=='L'){pos--;}
        mvcount++;
      }
    }
    for(int o = 0;o<ch.length;o++)
  	{
    	System.out.print(cnt[o]+" ");
  	}
  	System.out.println("");
  }
}