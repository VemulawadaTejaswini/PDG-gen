import java.util.*;
public  class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  
  String h[]=sc.nextLine().split(" ");
 int n=Integer.parseInt(h[0]);
 int k=Integer.parseInt(h[1]);
 long ans=0;
 long sum=0;
 long sum1=0;
 long MOD=1000000007;
 for(int i=0;i<k;i++)
 {
 	sum+=i;
 	sum1+=(n-i);
 }
 int u=k;
 int uu=(n-k);
while(sum<=sum1)
{
	ans=ans+(sum1-sum)+1;
	sum+=u;
	sum1+=uu;
	u+=1;
	uu-=1;
}
System.out.println(ans%MOD);
 }
 
}

