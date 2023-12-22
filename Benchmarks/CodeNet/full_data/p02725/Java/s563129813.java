import java.io.*;
import java.util.Arrays;
public class Main
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int k,n,tot=0;
    k=Integer.parseInt(br.readLine());
    n=Integer.parseInt(br.readLine());
    int arr[]=new int[n];
    int dis[]=new int[n];
    for(int i=0;i<n;i++)
    {
      dis[i]=arr[i+1]-arr[i];
    }
    Arrays.sort(dis);
    for(int i=0;i<n-1;i++)
    {
      tot=arr[i];
    }
    System.out.println(tot);
  }
}
