import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int wrong=0;
    for(int i=0;i<n;i++)
      if(a[i]!=(i+1))
        wrong++;
    if(wrong==0||wrong==2)
      System.out.print("YES");
    else
      System.out.print("NO");
  }
}