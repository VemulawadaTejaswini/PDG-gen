import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      String t = sc.next();
      int cnt = 0;
      for(int i = 1;i <= n;i++){
      	if(s.substring(n-i,n).equals(t.substring(0,i)))cnt++;
        else break;
      }
      System.out.println(2*n-cnt);
    }
}