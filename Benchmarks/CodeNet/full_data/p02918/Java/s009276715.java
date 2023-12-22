import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int res = 0;
      for(int i = 0;i < n-1;i++){
      	if(c[i]=='R'&&c[i]==c[i+1])res++;
      }
      for(int i = 1;i < n;i++){
      	if(c[i]=='L'&&c[i]==c[i-1])res++;
      }
      for(int i = 0;i < n-1&&k > 0;i++){
      	if(c[i]=='R'&&c[i+1]=='L'){
          res+=2;
          k--;
        }
      }
      if(c[0]=='L'&&k > 0){
        res++;
        k--;
      }
      if(c[n-1]=='R'&&k > 0){
        res++;
        k--;
      }
      System.out.println(res);
    }
}