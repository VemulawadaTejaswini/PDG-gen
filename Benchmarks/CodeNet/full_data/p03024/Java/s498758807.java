import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
	    String[] r = result.split("o");
	    int count = r.length;
	    if(count < 6) {
	    	System.out.println("NO");
	    } else {
	    	System.out.println("YES");
	    	}
	    sc.close();
	}

}