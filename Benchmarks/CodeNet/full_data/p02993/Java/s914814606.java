import java.util.*;
public class Main
{
    public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
      long ar[]=new long[n];
    long sum=0;
        TreeSet<Long> set = new TreeSet<Long>(); 
    for(int i=0;i<(n);i++)
    {
        ar[i]=Sc.nextLong();
        set.add(Sc.nextLong());
    }
      int u=0;
    for(int i=n-1;i>=0;i--)
    {
      sum=sum+ar[i];
      if(sum>set.last())
      {		
        u=1;
        break;
	  }
    }
      if(u==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}