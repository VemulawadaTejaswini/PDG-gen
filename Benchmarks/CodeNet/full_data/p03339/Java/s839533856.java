import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] w = new int[n+2];
      int[] e = new int[n+2];
      for(int i = 1;i <= n;i++){
      	if(c[i-1]=='W')w[i]++;
        if(c[i-1]=='E')e[i]++;
        w[i]+=w[i-1];
        e[i]+=e[i-1];
      }
      int min = 10000000;
      for(int i = 0;i < n-1;i++){
        int x = e[n]-e[i+1];
        int y = w[i];
      	min = Math.min(min,x+y);
      }
      System.out.println(min);
    }
}
