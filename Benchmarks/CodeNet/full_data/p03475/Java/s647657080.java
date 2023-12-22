import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String str = r.readLine();
    int n = Integer.parseInt(str);
    String sl[];
    int c[] = new int[1000];
    int s[] = new int[1000];
    int f[] = new int[1000];
    for(int i = 0; i < n - 1; i++)
    {
      str = r.readLine();
      sl = str.split(" ");
      c[i] = Integer.parseInt(sl[0]);
      s[i] = Integer.parseInt(sl[1]);
      f[i] = Integer.parseInt(sl[2]);
    }
    
    int a[] = new int[1000];
    for(int i = 0; i < n - 1; i++)
    {
      int t = 0;
      for(int j = i; j < n - 1; j++)
      {
        if(t < s[j])
        {
          t = s[j];
          //System.out.println(t);
        }
        else
        {
          t = (t * f[j] + f[j] - 1) / f[j];
          //System.out.println(t);
        }
        t += c[j];
        //System.out.println(t);
      }
      a[i] = t;
    }
    
    for(int i = 0; i < n; i++)
    {
      System.out.println(a[i]);
    }
    
  }
}
