import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      long a = in.nextLong();
      long b = in.nextLong();
      long x = in.nextLong();
      long cnt = 0;
      if(a%x==0)cnt++;
      cnt+=b/x-a/x;
      System.out.println(cnt);
    }
}