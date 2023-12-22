import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    Scanner in=new Scanner(System.in);
    PrintWriter pw=new PrintWriter(System.out, true);
    int n=in.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      int num=in.nextInt();
      arr.add(num);
      a[i]=num;
    }
    Collections.sort(arr);
    for(int i=0;i<n;i++)
    {
      if(a[i]<=arr.get((n/2)-1))
      pw.println(arr.get(n/2));
      else
      pw.println(arr.get((n/2)-1))  ;
    //  arr.add(ind,a[i]);
    }
  }
}
