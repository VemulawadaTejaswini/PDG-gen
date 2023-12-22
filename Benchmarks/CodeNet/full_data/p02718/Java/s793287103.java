import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int M=in.nextInt();int A[]=new int [N];
    int i;long p=0,m=0;
    for(i=0;i<N;i++)
    {
      A[i]=in.nextInt();
      p=p+A[i];
    }
    int y=(int)Math.round((p/(4.0*M)));
    for(i=0;i<N;i++)
    {
      if(A[i]>=y)
      {
        m++;
      }
    }
    if(m>=M)
      System.out.println("Yes");
      else
        System.out.println("No");
  }
}
      
    
