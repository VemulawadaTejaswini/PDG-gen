import java.util.*;

public class Main {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	String clear = in.nextLine();
	String s = in.nextLine();
	long ans = 0;
	int i =0;
	while(i<n){
	    ans++;
	    while(i<(n-1) && s.charAt(i) == s.charAt(i+1)){
		i++;
	    }
	    ++i;
	}
	System.out.println(ans);
    }
}
