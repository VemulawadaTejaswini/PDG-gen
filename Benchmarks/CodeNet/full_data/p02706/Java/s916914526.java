import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m];
    int s=0;
    int v=-1;
    for(int i=0;i<m;i++)
    {
        a[i]=sc.nextInt();
        s+=a[i];
    }
    if(n>s)
    v=n-s;
    else if(n==s)
    v=0;
    else
    v=-1;
    System.out.println(v);
    
  }
}
