import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    
	    int ans = 1000;
	    for (int i=0; i<S.length()-2; i++){
	    	String a= S.substring(i, i+3);
	    	int b = Integer.valueOf(a);
	    	
	    	ans = Math.min(ans, Math.abs(b-753));
	    }
	    
	    System.out.println(ans);
	    sc.close();
	}

}
