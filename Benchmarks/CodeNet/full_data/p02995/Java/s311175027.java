import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
		int c=sc.nextInt();
		int d=sc.nextInt();
  		long ans=0;
  		long ansa=0;
  		long ansb=0;
        long divide=lcm(c,d);
		ansb=b-(b/c+b/d-b/divide);
        ansa=a-1-((a-1)/c+(a-1)/d-(a-1)/divide);
  		ans=ansb-ansa;
    	System.out.println(ans);
    }
  private static long lcm(long a, long b){
  return a*b/gcd(a,b);
}
  private static long gcd(long a,long b){
   if(b==0){
   	return a;
   }
	return gcd(b, a%b);
}
}