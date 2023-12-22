import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    if (N==3 || N==5 || N==7)
	    	System.out.println("YES");
	    else
	    	System.out.println("NO");
	    sc.close();

	}

}