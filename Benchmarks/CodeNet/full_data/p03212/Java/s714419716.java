import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextLong();
    static int res = 0;
	public static void main(String[] args){
      dfs(0,false,false,false);
      System.out.println(res);
    }
    static void dfs(long num,boolean a,boolean b,boolean c){
    	if(num > n)return;
      if(a&&b&&c)res++;
      dfs(num*10+3,true,b,c);
      dfs(num*10+5,a,true,c);
      dfs(num*10+7,a,b,true);
    }
}
