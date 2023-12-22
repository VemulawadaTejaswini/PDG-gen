import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		String sub1 = str.substring(0, n/2);
		String sub2 = str.substring(((n+3)/2) -1 ,n );
		if (sub1.equals(sub2)) 
		    System.out.println("Yes");
		else 
		    System.out.println("No");
		
    }
}

