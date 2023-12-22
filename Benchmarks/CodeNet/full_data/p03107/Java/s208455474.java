import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int b = 0;
	int r = 0;
	for(int i = 0; i<s.length();i++) {
	    char c = s.charAt(i);
	    if(c=='0') b++;
	    else r++;
	}
	System.out.println((int)Math.min(b,r)*2);
    }
}