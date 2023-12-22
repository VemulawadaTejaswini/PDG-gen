import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        
        String ans;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

	if (x ==  3 || x == 5 || x == 7) {
	    ans = "YES";
	} else {
	    ans = "NO";
	}
        System.out.println(ans);
    }
}
