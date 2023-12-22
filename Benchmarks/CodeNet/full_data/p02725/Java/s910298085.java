import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int n=sc.nextInt();
    int[] a=new int[n];
	for(int i=0;i<n;i++)
    {
	a[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    Arrays.sort(a);
    for(int i=0;i<a.length;i++)
    {int sum=0;
      int x=0;
     for(int j=i;j<i+a.length-1;j++)
     {
       x=a[(j+1)%a.length]-a[j%a.length];
       if(x<0)
       {
         x=p+x;
       }
       sum+=x;
    }
      if(sum<min)
      {
		min=sum;
      } 
    }
    System.out.println(min);
    
  }
}