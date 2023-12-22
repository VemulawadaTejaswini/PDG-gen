import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long N=sc.nextInt();
    long P=sc.nextInt();
    String S=sc.next();
    int cnt=0;
    for(int i=0;i<N;i++)
    {
     String sub;
      for(int j=i;j<N;j++)
      { 
        sub=S.substring(i,j+1);
        long re=Integer.parseInt(sub);
        if(re%P==0)
        {
          cnt=cnt+1;
        }
      }
    }
    System.out.println(cnt);
  }
}
        