import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		long d = scn.nextLong();
		long n = scn.nextLong();
      	long ans = 0;
      	if(d==0){
          ans = n;
        }else{
          long dd = (long)Math.pow(100,d);
          ans = dd*n;
        }
      	System.out.println(ans);
	}
}
