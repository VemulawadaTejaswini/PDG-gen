import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	int max = Math.max(a,Math.max(b,c));
	int min = Math.min(a,Math.max(b,c));
	
    	System.out.println(max-min);
    }
 private void solveB() {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	int l = s.length();
	String ans = "No";

	for(int i=0; i < l; i++){
	    t = t.charAt(l-1) + t;
	    t = t.substring(0,l);
	    if (s.equals(t))  ans = "Yes";
	}
	System.out.println(ans);
	
    }
}