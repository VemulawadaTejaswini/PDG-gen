import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	String[] s = S.split("");
    	int ans = 0;
    	for(int i=0; i<3; i++) {
    	    if(s[i].equals("1") ans++;
    	}
    	System.out.println(ans);
    }
}