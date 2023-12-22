import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    char n[] = String.valueOf(N).toCharArray();
	    char a = n[0];
	    char b[] = {a,a,a};
	    int ans = Integer.parseInt(String.valueOf(b));
	    if(ans >= N){
	      System.out.println(ans);
	    }else{
	      ans += 111;
	      System.out.println(ans);
	    }
	    sc.close();
	  }
}