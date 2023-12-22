//package ldm;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 
       Scanner sc = new Scanner(System.in);
	   long n=sc.nextLong();
	   long a=sc.nextLong();
	   long b=sc.nextLong();
	   long k=sc.nextLong();
	   if(k==0) System.out.println(1);
	   else
	   {
		   long re=a,gr=a+b,bl=b;
		   BigInteger ans=BigInteger.ONE;
		   BigInteger sum=BigInteger.ZERO;
		   for(long i=2;i<=n;i++) ans=ans.multiply(BigInteger.valueOf(i));
		   for(long i=0;i<=n;i++)
		   {
			   if(i*re<=k&&(k-i*re)%gr==0)
			   {
				   long j=(k-i*re)/gr;
				   if(j<=n&&(i+j)<=n)
				   {
					   long h=n-i-j;
					   BigInteger t=BigInteger.ZERO;
					   t=t.add(ans);
					   BigInteger an=BigInteger.ONE;
					   for(long w=2;w<=i;w++) an=an.multiply(BigInteger.valueOf(w));
					   BigInteger anss=BigInteger.ONE;
					   for(long w=2;w<=j;w++) anss=anss.multiply(BigInteger.valueOf(w));
					   BigInteger ansss=BigInteger.ONE;
					   for(long w=2;w<=h;w++) ansss=ansss.multiply(BigInteger.valueOf(w));
					   t=t.divide(ansss);
					   t=t.divide(an);
					   t=t.divide(anss);
					   sum=sum.add(t);
				   }
			   }
		   }
		   for(long i=0;i<=n;i++)
		   {
			   if(i*gr<=k&&(k-i*gr)%bl==0)
			   {
				   long j=(k-i*gr)/bl;
				   if(j<=n&&(i+j)<=n)
				   {
					   long h=n-i-j;
					   BigInteger t=BigInteger.ZERO;
					   t=t.add(ans);
					   BigInteger an=BigInteger.ONE;
					   for(long w=2;w<=i;w++) an=an.multiply(BigInteger.valueOf(w));
					   BigInteger anss=BigInteger.ONE;
					   for(long w=2;w<=j;w++) anss=anss.multiply(BigInteger.valueOf(w));
					   BigInteger ansss=BigInteger.ONE;
					   for(long w=2;w<=h;w++) ansss=ansss.multiply(BigInteger.valueOf(w));
					   t=t.divide(ansss);
					   t=t.divide(an);
					   t=t.divide(anss);
					   sum=sum.add(t);
				   }
			   }
		   }
		   for(long i=0;i<=n;i++)
		   {
			   if(i*re<=k&&(k-i*re)%bl==0)
			   {
				   long j=(k-i*re)/bl;
				   if(j<=n&&(i+j)<=n)
				   {
					   long h=n-i-j;
					   BigInteger t=BigInteger.ZERO;
					   t=t.add(ans);
					   BigInteger an=BigInteger.ONE;
					   for(long w=2;w<=i;w++) an=an.multiply(BigInteger.valueOf(w));
					   BigInteger anss=BigInteger.ONE;
					   for(long w=2;w<=j;w++) anss=anss.multiply(BigInteger.valueOf(w));
					   BigInteger ansss=BigInteger.ONE;
					   for(long w=2;w<=h;w++) ansss=ansss.multiply(BigInteger.valueOf(w));
					   t=t.divide(ansss);
					   t=t.divide(an);
					   t=t.divide(anss);
					   sum=sum.add(t);
				   }
			   }
		   }
		   BigInteger m=new BigInteger("998244353");
		   sum=sum.mod(m);
		   System.out.println(sum);
	   }
	}
}
