import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int m,i,n,sum=0;
      n=sc.nextInt();
      m=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        sum+=a[i];
      }
      int r=sum/4;
      r/=m;
      int ans=0;
      for(i=0;i<n;i++)
      {
        if(a[i]>r)ans++;
      }
      if(ans>=m)System.out.println("YES");
      else System.out.println("NO");
    }
}