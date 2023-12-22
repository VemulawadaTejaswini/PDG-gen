import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.next();
	    	int count = 0;
	    	int minus = 0;
	    	int top = s.length()-1;
	    	for (int i = s.length()-1; i >= 0; i--) {
			if (String.valueOf(s.charAt(i)).equals("B")) {
				count += top - i - minus;
				minus++;
			}
		}
	    	System.out.println(count);
	}
}
