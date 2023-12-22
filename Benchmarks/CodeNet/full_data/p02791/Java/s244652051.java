import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int min = 210000;
    for (int i = 0; i < n; i++) {
	    int p = sc.nextInt();
	    if (p <= min) {
	    	ans++;
	    	min = p;
	    }
    }
	System.out.println(ans);    	
  }
}

