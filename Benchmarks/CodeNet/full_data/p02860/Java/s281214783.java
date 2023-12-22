import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    if (N % 2 == 0) {
    	String str = sc.next();
    	String half = str.substring(0, N/2);
    	if(str.equals(half+half)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    } else {
    	System.out.println("No");
    }
  }
}