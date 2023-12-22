import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
        if(S.equals("Sunny")) {
    		System.out.println("Cloudy");
        } else if(S.equals("Cloudy")) {
    		System.out.println("Rainy");
        } else if(S.equals("Rainy")) {
    		System.out.println("Sunny");
        } else {
    		scan.close();
        	return;
        }
		
		scan.close();
	}

}
