import java.util.*;

public class Main {
    static long combination(long n,long r)
    {
        long ans=1;
        for(long i=0;i<r;i++)
        {
            ans=(ans*(n-i))/(i+1);
        }
        return ans;
    }
    
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	long e=sc.nextLong();
      	long o=sc.nextLong();
      	long ans=0;
      	if(e>=2){
          ans+=combination(e,2);
        }
      	if(o>=2){
          ans+=combination(o,2);
        }
      System.out.println(ans);
    }
}
