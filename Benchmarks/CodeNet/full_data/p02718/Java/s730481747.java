import java.util.*;
public class Main {
static int a[]=new int [1100];
  public static void main(String args[])
  {
	  Scanner input=new Scanner(System.in);
	  int n,m;
	  n=input.nextInt();m=input.nextInt();
	  int sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  a[i]=input.nextInt();sum+=a[i];}
	  int limt=sum/(4*m);
	  Arrays.sort(a,1,1+n);
	  for(int i=n;i>=1;i--)
	  {
		  
		  if(a[i]>=limt)m--;
		  else
			  break;
		  if(m==0)break;
	  }
	  if(m==0)System.out.println("Yes");
	  else
		  System.out.println("No");
  }
}