import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        
        int ans = 0;
	int dif = 0;
	int min = 753;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

	for (int i = 0; i <= s.length()-3; i++) {
	    dif = Math.abs(753 -
			   Integer.parseInt(s.substring(i, i+3)));
	    if(dif < min){
		min = dif;
	    }
	}

	ans = min;
	    
        System.out.println(ans);
    }
}