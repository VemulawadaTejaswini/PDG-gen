import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] l = new int[n];
      int[] r = new int[n];
      int cnt = 0;
      int min = 10000000;
      for(int i = 0;i < n;i++){
      	for(int j = 0;j <= i-1;j++)if(c[j]=='W')cnt++;
        for(int j = i;j < n;j++)if(c[j]=='E')cnt++;
        min = Math.min(cnt,min);
        cnt = 0;
      }
      System.out.println(min);
    }
}