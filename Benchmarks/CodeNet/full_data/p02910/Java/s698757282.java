import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] c = sc.next().toCharArray();
      int cnt = 0;
      for(int i = 0;i < c.length;i++){
      	if(i%2==0){
        	if(c[i]=='R'||c[i]=='U'||c[i]=='D')cnt++;
        }else{
        	if(c[i]=='L'||c[i]=='U'||c[i]=='D')cnt++;
        }
      }
      if(cnt==c.length)System.out.println("Yes");
      else System.out.println("No");
    }
}