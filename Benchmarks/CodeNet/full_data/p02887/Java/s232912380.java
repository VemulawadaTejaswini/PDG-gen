import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String s = sc.next();
    	
    	int ans = 1;
    	char before = s.charAt(0);    	
    	for(int i = 1; i < n; i++) {
    		if(before != s.charAt(i)) {
    			ans++;
    			before = s.charAt(i);
    		}
    	}
    	
    	System.out.println(ans);

	}

}
