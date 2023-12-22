import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      long k = sc.nextLong();
      long[] cnt = new long[s.length()];
      long sum = 0;
      for(int i = 0;i < s.length();i++){
      	long x = Integer.parseInt(s.substring(i,i+1));
        cnt[i]=(long)Math.pow(x,5*Math.pow(10,15));
        sum += cnt[i];
        if(k < sum){
        	System.out.println(x);
            return;
        }
      }
      
    }
}