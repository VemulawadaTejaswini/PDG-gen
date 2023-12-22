import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      long n = s.nextLong();
      char[] c = s.next().toCharArray();
        long ans =0;
      for(int i=0;i<n-1;i++)
      {
        if(c[i]=='#' && c[i+1]=='.')
        {
            c[i+1]='#';
            ans++;
        }
      }
      System.out.println(ans);
    }

    

}