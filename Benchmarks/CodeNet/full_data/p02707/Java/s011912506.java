import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    int n=Integer.parseInt(br.readLine());
    String str[]=br.readLine().split(" ");
    int boss[]=new int[n+1];
    for(int i=0;i<n-1;i++)
    boss[Integer.parseInt(str[i])]++;
    for(int i=1;i<=n;i++)
    pw.println(boss[i]);
    pw.flush();
    pw.close();
  }
}