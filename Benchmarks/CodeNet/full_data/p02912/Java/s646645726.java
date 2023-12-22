import java.util.Scanner;
import java.util.PriorityQueue;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    PriorityQueue q=new PriorityQueue();
    int n=scan.nextInt();
    int m=scan.nextInt();
    //int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      q.add(-1*scan.nextInt());
    }
    for(int i=0;i<m;i++)
    {
      int tmp=(int)q.poll();
      tmp/=2;
      q.add(tmp);
    }
    int ans=0;
    while(!q.isEmpty())
    {
		ans-=(int)q.poll();
    }
    System.out.println(ans);
  }
}