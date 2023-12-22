import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(s(n,0));
    }
    public static int s(int n,int c){
      if(n < 6)return n+c;
      int a = 1;
      int b = 1;
      while(a*6<=n)a*=6;
      while(b*9<=n)b*=9;
      return Math.min(s(n-a,c+1),s(n-b,c+1));
    }
}