import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long a=0;
		for(long c=1;c<=k;c++){
    		for(long d=1;d<=k;d++){
            for(long e=1;e<=k;e++){
            a+=gcd(c,gcd(d,e));
            }
            }
    	}
    
    	System.out.println(a);
    }
  private static long gcd(long a,long b){
   if(b==0){
   	return a;
   }
	return gcd(b, a%b);
}
}
