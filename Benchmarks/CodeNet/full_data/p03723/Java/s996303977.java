import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long cnt = 0;
      long s = a+b+c;
      if(a==b&&b==c){
      	System.out.println(-1);
        return;
      }
      while(a%2==0&&b%2==0&&c%2==0){
      	a = -a/2+s;
        b = -b/2+s;
        c = -c/2+s;
        cnt++;
      }
      System.out.println(cnt);
    }
}
