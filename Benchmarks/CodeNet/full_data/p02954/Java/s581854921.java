import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] ch = s.toCharArray();
    byte by[] = new byte[s.length()];
    for(int i = 0;i<s.length();i++)
    {
      if(ch[i]=='R')
      {
        by[i] = 0;
      }
      else
      {
        by[i] = 1;
      }
    }
    int cnt[] = new int[by.length];
    for(int i = 0;i<by.length;i++)
    {
      byte before = by[i];
      int mvcount = 0;
      int pos = i;
      while(true)
      {
        byte now = by[pos];
        if(!(now==before))
        {
          if(mvcount%2==0)
          {
            cnt[pos]++;
            break;
          }
          else
          {
            if(now==0)
            {
              cnt[pos+1]++;
              break;
            }
            else if(now==1)
            {
              cnt[pos-1]++;
             break; 
            }
          }
        }
        before = now;
        if(now==0){pos++;}
        else if(now==1){pos--;}
        mvcount++;
      }
    }
    for(int o = 0;o<by.length;o++)
  	{
    	System.out.print(cnt[o]+" ");
  	}
  	System.out.println("");
  }
}