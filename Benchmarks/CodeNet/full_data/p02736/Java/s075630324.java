import java.util.*;
public class Main
{
  private int absdiff(int a,int b)
  {
    return (a>b?a-b:b-a);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int arr[][]=new int[n][];
    String s=sc.nextLine();
    for(int i=0;i<n;i++)
    {
      arr[i]=new int[n-i];
      arr[i][0]=Integer.parseInt(s.charAt(i));
    }
    Main ob=new Main();
    for(int j=1;j<n;j++)
    {
      for(int i=0;i<(n-j);j++)
      {
        arr[i][j]=ob.absdiff(arr[i][j-1],arr[i+1][j-1]);
      }
    }
    System.out.println(arr[0][n-1]);
  }
}
